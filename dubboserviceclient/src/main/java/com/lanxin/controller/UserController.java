package com.lanxin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lanxin.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cyh on 2021/3/2.
 */
@RestController
public class UserController {

    @Reference(group = "group2",timeout = 1500,cluster = "failfast",mock = "com.lanxin.service.MockUserService")
    private UserService userService;

    @RequestMapping("hello")
    public String hello(){
        String str = userService.say("lanxin");
        return str;
    }
}
