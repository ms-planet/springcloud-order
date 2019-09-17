package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @author zxlei
 * @date 2019/8/21 17:33
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public class OrderExcetion extends RuntimeException {

    private Integer code;

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public OrderExcetion(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderExcetion(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
