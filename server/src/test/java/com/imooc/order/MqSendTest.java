package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zxlei
 * @date 2019/8/27 17:38
 * ----------------------------------------------
 * 发送mq消息测试
 * ----------------------------------------------
 */
@Component
public class MqSendTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "now " + System.currentTimeMillis());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder","computer", "now " + System.currentTimeMillis());
    }

}
