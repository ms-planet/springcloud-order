package com.imooc.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zxlei
 * @date 2019/8/23 14:32
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Data
@AllArgsConstructor
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;


    /**
     * 商品数量
     */
    private Integer productQuantity;
}
