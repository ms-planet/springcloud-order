package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author zxlei
 * @date 2019/8/28 14:51
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {


//    @StreamListener(StreamClient.INPUT)
//    @SendTo(StreamClient.OUTPUT)
//    public Object processInput(Object o) {
//        log.info("StreamReceiver : {}", o);
//        return o;
//    }

    @StreamListener(StreamClient.OUTPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(Object o) {
        log.info("StreamReceiver : {}", o);
        return "received";
    }

    @StreamListener(StreamClient.INPUT2)
    public void process2(Object o) {
        log.info("StreamReceiver2 : {}", o);
    }


}
