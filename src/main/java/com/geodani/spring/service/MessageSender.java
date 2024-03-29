package com.geodani.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private MessageBuilder builder;

    public void sendMessage(){

        System.out.println("Sending message...");

        String message = builder.createMessage();

        System.out.println(message + " sent!");
    }



}
