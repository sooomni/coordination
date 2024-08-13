package com.coordination.goods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsSummaryVO {

    private String brand;

    private List<GoodsVO> category;

    private long totalPrice;
}
