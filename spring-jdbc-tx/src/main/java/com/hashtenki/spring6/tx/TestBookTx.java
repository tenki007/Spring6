package com.hashtenki.spring6.tx;

import com.hashtenki.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Component
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBookTx {
    @Autowired
    BookController bookController;
    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
    }
}
