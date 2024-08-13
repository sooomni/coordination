package com.coordination.goods.dto.goodsIf100;

import com.coordination.goods.dto.GoodsSummaryVO;
import com.coordination.goods.dto.GoodsVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsIf100Response {

    private GoodsSummaryVO lowestPriceGoods;
}
