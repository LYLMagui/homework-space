package com.ukir.service;

import com.ukir.entity.Book;

import java.util.List;

/**
 * @author ukir
 * @date 2022/08/13 10:06
 **/
public interface BookService {
    /**
     * 查询全部图书
     */
    List<Book> getAllBook();
}
