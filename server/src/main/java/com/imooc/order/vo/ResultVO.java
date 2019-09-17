package com.imooc.order.vo;

import lombok.Data;

/**
 * @author zxlei
 * @date 2019/8/21 14:06
 * ----------------------------------------------
 * http请求返回的最外层对象
 * ----------------------------------------------
 */
@Data
public class ResultVO<T> {


    private Integer code;

    private String message;

    private T data;

}
