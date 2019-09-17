package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @author zxlei
 * @date 2019/8/21 16:25
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);


    /**
     * 完结订单(只能卖家来操作)
     *
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);

}
