package com.ribbon.service.service;

import com.hero.fitness.utils.Result;
import com.hero.fitness.utils.ResultUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ribbon.service.response.UserGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: service-ribbon
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:53
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public Result<UserGetResponse> getUser() {
        return restTemplate.getForObject("http://SERVICE-USER/user/getUser",Result.class);
    }


    public Result<UserGetResponse> hiError() {
        return ResultUtils.error(-1, "hi,there has some errors in you programmer!");
    }
}
