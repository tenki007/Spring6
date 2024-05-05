package com.hashtenki.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.OctetStreamData;

public class TestBook {
    @Test
    public void testBook() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookcon", Book.class);
        System.out.println(book.toString());
    }
}
