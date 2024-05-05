package com.hashtenki.junit5;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Component
@SpringJUnitConfig(locations = {"classpath:bean.xml"})
public class SpringTestJunit5 {
    @Autowired
    @Qualifier("user")
    private User user;
    @Test
    public void test()
    {
        System.out.println("test");
        user.run();
    }
}