package com.xiaoyuer.cld.prodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * created by xiaoyuer
 */
@RestController
public class MessageController {


    @Value("${server.port}")
    String port;



    @RequestMapping("/give")
    public String give(@RequestParam("name") String name, HttpServletRequest request){

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String paramName = (String) headerNames.nextElement();
            String value = request.getHeader(paramName);
            System.out.println("header参数：" + paramName + "=" + value);
        }

        return "Hi " + name + " ,I am from port:" + port;
    }
}
