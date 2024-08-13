package com.coordination.goods.dto.goodsIf101;

import com.coordination.goods.dto.GoodsVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsIf101Response {

    private List<GoodsVO> goodsList;

    private long totalPrice;
}
