package com.coordination.goods.api;

import com.coordination.common.exception.CommonResponseMessage;
import com.coordination.common.exception.dto.ApiResponse;
import com.coordination.goods.dto.goodsIf102.GoodsIf102Request;
import com.coordination.goods.dto.goodsIf103.GoodsIf103Request;
import com.coordination.goods.dto.goodsIf104.GoodsIf104Request;
import com.coordination.goods.service.GoodsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/goods")
@RequiredArgsConstructor
@Slf4j
public class GoodsApiController {

    private final GoodsService goodsService;

    //IF-100 단일 브랜드로 모든 카테고리 상품을 구매 시 최저가격에 판매 브랜드와 카테고리 상품가격, 총액 조회
    @GetMapping("/summary/singlebrand")
    public ApiResponse getSingleBrandLowestPriceCoordination() {
        return new ApiResponse(goodsService.getSingleBrandLowestPriceCoordination(), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-101 카테고리 별 최저가격 브랜드와 상품 가격, 총액 조회
    @GetMapping("/summary/multibrand")
    public ApiResponse getLowestPriceGoodsInfoByCategory() {
        return new ApiResponse(goodsService.getLowestPriceGoodsInfoByCategory(), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-102 카테고리 이름으로 최저, 최고 가격 브랜드와 상품 가격 조회
    @GetMapping("/summary/category")
    public ApiResponse getLowestAndHighestGoodsInfoByCategory(@RequestBody GoodsIf102Request request) {
        return new ApiResponse(goodsService.getLowestAndHighestGoodsInfoByCategory(request.getCategory()), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-103 상품 등록
    @PostMapping("/")
    public ApiResponse createGoods(@RequestBody GoodsIf103Request request) {
        return new ApiResponse(goodsService.createGoods(request), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-104 상품 수정
    @PutMapping("/{id}")
    public ApiResponse updateGoods(@PathVariable("id") Long goodsId, @RequestBody GoodsIf104Request request) {
        return new ApiResponse(goodsService.updateGoods(goodsId, request), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-105 상품 삭제
    @DeleteMapping("/{id}")
    public ApiResponse deleteGoods(@PathVariable("id") Long goodsId) {
        return new ApiResponse(goodsService.deleteGoods(goodsId), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-106 상품 전체 조회
    @GetMapping("/")
    public ApiResponse getAllGoods() {
        return new ApiResponse(goodsService.getAllGoodsList(), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

    //IF-107 상품 상세 조회
    @GetMapping("/{id}")
    public ApiResponse getGoodsDetail(@PathVariable("id") Long goodsId) {
        return new ApiResponse(goodsService.getGoodsDetail(goodsId), HttpStatus.OK, CommonResponseMessage.SUCCESS);
    }

}
