package com.hashtenki.autowired;

import com.hashtenki.autowired.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
@Test
    public void testUser()
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(config.class);
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }
}
