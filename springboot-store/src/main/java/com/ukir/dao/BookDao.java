package com.ukir.dao;

import com.ukir.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getAllBook();

    /**
     * 添加图书
     */
    Book saveBook(Book book);


}
