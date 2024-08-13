package com.coordination.goods.excption;

import lombok.Getter;

@Getter
public class GoodsException extends RuntimeException{
    private GoodsExceptionCode goodsExceptionCode;

    public GoodsException() {
        super();
    }

    public GoodsException(String message) {
        super(message);
    }

    public GoodsException(GoodsExceptionCode goodsExceptionCode) {
        this.goodsExceptionCode = goodsExceptionCode;
    }
}
