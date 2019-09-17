package com.imooc.order.dto;

import com.imooc.order.entity.OrderDetail;
import lombok.Data;


import java.math.BigDecimal;
import java.util.List;

/**
 * @author zxlei
 * @date 2019/8/21 16:26
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Data
public class OrderDTO {


    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态, 默认为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态, 默认未支付
     */
    private Integer payStatus;


    /**
     * 订单详细
     */
    private List<OrderDetail> orderDetailList;


}
