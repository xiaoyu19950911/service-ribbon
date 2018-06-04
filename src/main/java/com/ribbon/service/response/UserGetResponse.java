package com.ribbon.service.response;

import lombok.Data;

import java.util.List;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:22
 **/
@Data
public class UserGetResponse {

    private String port;

    private List<User> userList;
}
