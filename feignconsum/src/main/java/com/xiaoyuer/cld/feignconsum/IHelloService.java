package com.xiaoyuer.cld.feignconsum;

import com.xiaoyuer.cld.dmo.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.GET;

/**
 * created by xiaoyuer
 */
@FeignClient("producer")
public interface IHelloService {

    @RequestMapping("get")
    String testgo(@RequestParam String name);


    @RequestMapping("give")
    String testcome(@RequestBody Person name);

}
