package com.hashtenki.spring6.tx.dao;

public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateUserBalance(Integer userId, Integer price);
}
