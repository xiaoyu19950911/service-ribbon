package com.ribbon.service.service;

import com.hero.fitness.utils.Result;
import com.ribbon.service.response.UserGetResponse;

/**
 * @program: service-ribbon
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:53
 **/
public interface UserService {
    Result<UserGetResponse> getUser();
}
