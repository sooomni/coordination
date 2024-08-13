package com.coordination.goods.dto;

import com.coordination.common.config.CustomLongSerializer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({ "category", "price", "brandId"})
public class GoodsVO {

    @JsonSerialize(using = CustomLongSerializer.class)
    private Long goodsId;

    @JsonSerialize(using = CustomLongSerializer.class)
    private Long price;

    private String category;

    private String brandId;
}
