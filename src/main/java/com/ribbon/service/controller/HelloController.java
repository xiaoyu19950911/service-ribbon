package com.ribbon.service.controller;

import com.ribbon.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: service-ribbon
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-01 20:03
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
