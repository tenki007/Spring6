package com.hashtenki.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject() {
        //记载Spring配置文件，对象创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User user = (User) context.getBean("user");
        //使用对象调用方法
        user.add();
    }

    @Test
    public void testUserObject2() throws Exception {
        Class clazz = Class.forName("com.hashtenki.spring6.User");
        User user = (User)clazz.newInstance();
        System.out.println(user);
    }
}
