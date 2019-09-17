package com.imooc.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxlei
 * @date 2019/8/21 17:36
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    PARAMS_ERROR(1, "参数错误！"),

    CAT_EMPTY(2, "购物车为空"),

    ORDER_NOT_EXIST(3, "订单不存在"),

    ORDER_STATUS_ERROR(4, "订单状态错误"),

    ORDER_DETAIL_NOT_EXIST(5, "订单详情不存在"),
    ;

    private int code;

    private String message;


}
