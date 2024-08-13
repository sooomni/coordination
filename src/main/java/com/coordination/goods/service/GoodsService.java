package com.coordination.goods.service;

import com.coordination.goods.dto.*;
import com.coordination.goods.dto.goodsIf100.GoodsIf100Response;
import com.coordination.goods.dto.goodsIf101.GoodsIf101Response;
import com.coordination.goods.dto.goodsIf102.GoodsIf102Response;
import com.coordination.goods.excption.GoodsException;
import com.coordination.goods.excption.GoodsExceptionCode;
import com.coordination.goods.mapper.GoodsMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public GoodsIf100Response getSingleBrandLowestPriceCoordination(){
        List<GoodsVO> goodsList = goodsMapper.findSingleBrandLowestPriceCoordination();
        GoodsIf100Response result = new GoodsIf100Response();

        GoodsSummaryVO goodsSummaryVO = new GoodsSummaryVO();
        goodsList.stream().map(e -> e.getBrandId()).distinct().findFirst().ifPresent(e -> goodsSummaryVO.setBrand(e));
        goodsList.stream().forEach(e-> e.setBrandId(null));

        goodsSummaryVO.setCategory(goodsList);

        long totalPrice = goodsList.stream().mapToLong(e -> e.getPrice()).sum();
        goodsSummaryVO.setTotalPrice(totalPrice);

        result.setLowestPriceGoods(goodsSummaryVO);
        return result;
    }

    public GoodsIf101Response getLowestPriceGoodsInfoByCategory() {
        List<GoodsVO> goodsList = goodsMapper.findLowestPriceGoodsInfoByCategory();

        GoodsIf101Response result = new GoodsIf101Response();
        result.setGoodsList(goodsList);

        long totalPrice = goodsList.stream().mapToLong(e -> e.getPrice()).sum();
        result.setTotalPrice(totalPrice);

        return result;
    }

    public GoodsIf102Response getLowestAndHighestGoodsInfoByCategory(String category) {
        if(ObjectUtils.isEmpty(category)){
            throw new GoodsException(GoodsExceptionCode.NOT_FOUND_PARAM_CATEGORY);
        }
        List<GoodsVO> goodsList = goodsMapper.findLowestAndHighestGoodsInfoByCategory(category);

        GoodsIf102Response result = new GoodsIf102Response();
        if(goodsList.size() != 2){
            throw new GoodsException(GoodsExceptionCode.NOT_EXPECTED_DATA);
        } else{
            result.setCategory(category);
            result.setLowestPriceGoods(goodsList.get(0));
            result.setHighestPriceGoods(goodsList.get(1));
        }

        return result;
    }

    // 상품 등록
    @Transactional
    public Boolean createGoods(GoodsVO goods) {
        return goodsMapper.createGoods(goods) > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Transactional
    public Boolean updateGoods(Long goodsId, GoodsVO goods) {
        log.info(goods.toString());
        goods.setGoodsId(goodsId);
        log.info("여기"+goods.toString());
        return goodsMapper.updateGoods(goods) > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Transactional
    public Boolean deleteGoods(Long goodId) {
        try {
            goodsMapper.deleteGoods(goodId);
        }catch(EmptyResultDataAccessException e){
            throw new GoodsException(GoodsExceptionCode.NOT_FOUND_GOODS);
        }
        return true;
    }
    public List<GoodsVO> getAllGoodsList() {
        return goodsMapper.findAll();
    }

    public GoodsVO getGoodsDetail(Long goodsId) {
        GoodsVO goodsVO = goodsMapper.findByGoodsId(goodsId);
        if(ObjectUtils.isEmpty(goodsVO)){
            throw new GoodsException(GoodsExceptionCode.NOT_FOUND_GOODS);
        }
        return goodsVO;
    }
}

