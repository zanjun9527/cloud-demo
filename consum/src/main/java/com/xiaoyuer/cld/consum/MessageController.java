package com.xiaoyuer.cld.consum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * created by xiaoyuer
 */
@RestController
public class MessageController {



    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ITestService testService;


    @GetMapping("/show")
    public String showMessage(@RequestParam String name){

//        restTemplate.postForLocation()
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://producer/get?name=" + name, String.class);


//        String test = testService.test(name);

//        System.out.println("controller back:"+test);
//        return restTemplate.getForObject("http://producer/get?name="+name, String.class);

        return "123123";

    }



}
