package com.coordination.goods.mapper;

import com.coordination.goods.dto.GoodsSummaryVO;
import com.coordination.goods.dto.GoodsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    // 전체 목록 조회
    public List<GoodsVO> findAll();

    // 단건 조회
    public GoodsVO findByGoodsId(Long goodsId);

    // 삭제
    public void deleteGoods(Long goodsId);

    // 수정
    public int updateGoods(GoodsVO goods);

    // 등록
    public int createGoods(GoodsVO goods);

    public List<GoodsVO> findSingleBrandLowestPriceCoordination();

    public List<GoodsVO> findLowestPriceGoodsInfoByCategory();

    public List<GoodsVO> findLowestAndHighestGoodsInfoByCategory(String category);
}
