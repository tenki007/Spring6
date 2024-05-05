package com.hashtenki.autowired.controller;

import com.hashtenki.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {
    //注入service
    //第一种方式，属性注入
    @Autowired
    private UserService userService;

    //第二种方式，set方法注入
    @Autowired
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    //第三种方式，构造方法注入
    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    //第四种方式，方法形参注入
    public void setUserService2(@Autowired UserService userService)
    {
        this.userService = userService;
    }
    public void add()
    {
        System.out.println("Controller add...");
        userService.add();
    }

}
