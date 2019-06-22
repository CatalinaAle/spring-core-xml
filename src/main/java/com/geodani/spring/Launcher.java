package com.geodani.spring;

import com.geodani.spring.service.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        MessageSender sender = ctx.getBean(MessageSender.class);
        sender.sendMessage();
    }
}
