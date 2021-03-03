package com.lanxin.service;


/**
 * Created by cyh on 2021/3/2.
 */
public class MockUserService implements UserService{
    @Override
    public String say(String name) {
        return "mock";
    }
}
