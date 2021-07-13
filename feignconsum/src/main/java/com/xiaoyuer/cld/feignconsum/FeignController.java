package com.xiaoyuer.cld.feignconsum;

import com.xiaoyuer.cld.dmo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xiaoyuer
 */
@RestController
public class FeignController {


    @Autowired
    IHelloService helloService;

    @RequestMapping("testFeign")
    public  void test(){

        String feign_param = helloService.testgo("feign_param");

        System.out.println("123");
        System.out.println(feign_param);

    }

    @RequestMapping("testFeign2")
    public  void test2(){

        Person person = new Person();
        person.setName("woshiobj");
        person.setAge("23");


        String feign_param = helloService.testcome(person);

        System.out.println("123");
        System.out.println(feign_param);

    }
}
