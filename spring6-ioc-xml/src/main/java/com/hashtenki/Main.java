package com.hashtenki;

import com.hashtenki.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
//        // 根据获取bean
//        User user1 = (User) context.getBean("user");
//        System.out.println("1 根据id获取对象"+user1);
//        //根据类型获取bean
//        User user2 = context.getBean(User.class);
//        System.out.println("2 根据类型获取bean"+user1);
//        //根据id和类型获取bean
//        User user3 = context.getBean("user",User.class);
//        System.out.println("3 根据id和类型获取bean"+user1);
        UserDao userDao = context.getBean("userDao",UserDao.class);
    }
}