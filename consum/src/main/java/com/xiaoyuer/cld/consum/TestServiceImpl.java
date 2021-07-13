package com.xiaoyuer.cld.consum;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * created by xiaoyuer
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod="backfix")
    @Override
    public String test(String name) {
        System.out.println("kaishile");
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://producer/get?name=" + name, String.class);


        System.out.println("123123");
        return "23";
    }


    public  String backfix(String name,Throwable e){
        System.out.println("ceshi backfix"+e);
        return ">>>>>>>>>>>>>>>>>>>>>ceshifail>>>>>>>>>>>>>>>>>>>>>";
    }


}
