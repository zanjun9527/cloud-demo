package com.xiaoyuer.cld.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * created by xiaoyuer
 */
public interface MsgSender {

    @Output(Sink.INPUT)
    MessageChannel sendMsg();



}
