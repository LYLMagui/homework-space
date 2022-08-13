package com.ukir.service.impl;

import com.ukir.dao.BookDao;
import com.ukir.entity.Book;
import com.ukir.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ukir
 * @date 2022/08/13 10:08
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    /**
     * 查询全部图书
     */
    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
