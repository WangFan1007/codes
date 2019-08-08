package com.wang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("nihao"));
    }
}
