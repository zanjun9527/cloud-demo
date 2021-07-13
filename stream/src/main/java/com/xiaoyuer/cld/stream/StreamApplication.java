package com.xiaoyuer.cld.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StreamApplication {

    @Autowired
    MsgSender msgSender;


    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
    }



    @RequestMapping("/send")
    public String send(String msg) {

        msgSender.sendMsg().send(MessageBuilder.withPayload("Hello World...").build());
        return "消息发送成功===>" + msg;
    }



}
