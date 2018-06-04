package com.ribbon.service.controller;

import com.hero.fitness.utils.Result;
import com.ribbon.service.response.UserGetResponse;
import com.ribbon.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: service-ribbon
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:49
 **/
@RestController
@RequestMapping("/user")
public class UserWeb {

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/getUser",produces = {"application/json;charset=UTF-8"})
    public Result<UserGetResponse> getUser() {
        return userService.getUser();
    }
}
