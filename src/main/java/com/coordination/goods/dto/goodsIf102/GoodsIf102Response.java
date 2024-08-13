package com.coordination.goods.dto.goodsIf102;

import com.coordination.goods.domain.enums.Category;
import com.coordination.goods.dto.GoodsVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsIf102Response {

    private String category;

    private GoodsVO lowestPriceGoods;

    private GoodsVO highestPriceGoods;
}
