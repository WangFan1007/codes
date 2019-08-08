package com.wang.demo;

import com.wang.DemoService;

public class ServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "serviceImpl " + name;
    }
}
