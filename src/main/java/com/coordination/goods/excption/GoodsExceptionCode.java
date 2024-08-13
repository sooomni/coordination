package com.coordination.goods.excption;

import lombok.Getter;

@Getter
public enum GoodsExceptionCode {

    NOT_EXPECTED_ERROR(5000L, "서버 오류입니다."),
    NOT_EXPECTED_DATA(5001L, "데이터 조회 중 오류가 발생했습니다."),
    NOT_FOUND_GOODS(5002L, "상품이 존재하지 않습니다."),
    NOT_FOUND_CATEGORY(5003L, "카테고리가 존재하지 않습니다."),
    NOT_FOUND_PARAM_CATEGORY(5004L, "파라미터 카테고리가 존재하지 않습니다.");

    public Long code;
    public String message;

    GoodsExceptionCode(Long code, String message) {
        this.code = code;
        this.message = message;
    }
}
