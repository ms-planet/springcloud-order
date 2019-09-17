package com.imooc.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxlei
 * @date 2019/8/21 16:16
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum {

    WAIT(0, "等待支付"),

    SUCCESS(1, "支付成功");


    private int code;

    private String message;

}
