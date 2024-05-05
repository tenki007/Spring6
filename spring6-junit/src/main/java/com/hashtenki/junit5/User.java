package com.hashtenki.junit5;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void run(){
        System.out.println("user run");
    }
}
