package com.xiaoyuer.provider.prod;

import com.xiaoyuer.cld.dmo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * created by xiaoyuer
 */
@RestController
public class MessageController {


    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/get")
    public String getMessage(@RequestParam("name")String name){
//        if(1==1){
//            throw new RuntimeException("buczhi");
//        }


            ResponseEntity<String> forEntity = restTemplate.getForEntity("http://producerb/give?name=" + name, String.class);

            System.out.println(forEntity.getStatusCode()+"-----"+forEntity.getBody());

            return "Hi " + name + " ,I am from port:" + port;
    }

    @RequestMapping("/give")
    public String give(@RequestBody Person person){

//                restTemplate.postForLocation()
        return "Hi " + person.getName() + " ,I am from port:" + port;
    }
}
