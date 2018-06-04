package com.ribbon.service.response;

import lombok.Data;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 10:47
 **/

@Data
public class User {

    private Integer id;

    private String name;

    private Integer sex;

    private String address;
}
