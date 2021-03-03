package com.lanxin.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by cyh on 2021/3/2.
 */

@Service(timeout = 1000,retries = 3,group = "group2")
@Component
public class UserServiceImpl implements  UserService {
    @Override
    public String say(String name) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello1 "+name;
    }
}
