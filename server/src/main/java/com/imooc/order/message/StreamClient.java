package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zxlei
 * @date 2019/8/28 14:49
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public interface StreamClient {


    String INPUT = "myMessageInput";

    String OUTPUT = "myMessageOutput";

    String INPUT2 = "myMessageInput2";

    String OUTPUT2 = "myMessageOutput2";


    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2();

    @Output(StreamClient.OUTPUT2)
    MessageChannel output2();

}
