package com.imooc.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxlei
 * @date 2019/8/21 16:06
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {

    NEW(0, "新订单"),

    FINISHED(1, "完结"),

    CACEL(2, "取消");

    private Integer code;

    private String message;

}
