package com.coordination.goods.excption;

import com.coordination.goods.api.GoodsApiController;
import com.coordination.common.exception.dto.ApiResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = {GoodsApiController.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GoodsExceptonHandler {

 @ExceptionHandler
    public ApiResponse GoodsExceptionHandler(GoodsException e){
        return new ApiResponse(e.getGoodsExceptionCode().getCode(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                e.getGoodsExceptionCode().getMessage());
    }
}