package com.lanxin.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by cyh on 2021/3/2.
 */

@Service(timeout = 1000,retries = 3,group = "group1")
@Component
public class UserServiceImpl implements  UserService {

    //开发
    @Override
    public String say(String name) {
        return "Hello12 "+name;
    }
}
