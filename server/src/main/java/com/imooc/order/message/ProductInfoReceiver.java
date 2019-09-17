package com.imooc.order.message;

import com.fasterxml.jackson.core.type.TypeReference;
import com.imooc.order.utils.JsonUtil;
import com.imooc.product.client.common.ProductInfoOutPut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zxlei
 * @date 2019/8/29 10:35
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Component
@Slf4j
public class ProductInfoReceiver {

    private static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        //message ==> ProductInfo
        List<ProductInfoOutPut> productInfoOutPutList = (List<ProductInfoOutPut>) JsonUtil.fromJson(message, new TypeReference<List<ProductInfoOutPut>>() {
        });
        log.info("从队列【{}】接收到消息：{}", "productInfo", productInfoOutPutList);
        //储存到redis里面
        productInfoOutPutList.forEach(x -> {
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE, x.getProductId()),
                    String.valueOf(x.getProductStock()));
        });


    }

}
