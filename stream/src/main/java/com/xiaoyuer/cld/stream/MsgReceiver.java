package com.xiaoyuer.cld.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * created by xiaoyuer
 */
@EnableBinding(value = { Sink.class, MsgSender.class })
public class MsgReceiver {
    @StreamListener(Sink.INPUT)
    public void receiverMsg(Object msg) {
        System.out.println("消息接收者接收消息====>" + msg);
    }
}