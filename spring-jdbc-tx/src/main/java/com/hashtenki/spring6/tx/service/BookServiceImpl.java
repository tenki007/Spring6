package com.hashtenki.spring6.tx.service;

import com.hashtenki.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Transactional()
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        //根据图书id查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书库存-1
        bookDao.updateStock(bookId);
        //更新用户余额 -图书价格
        bookDao.updateUserBalance(userId, price);
    }
}
