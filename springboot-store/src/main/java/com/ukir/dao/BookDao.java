package com.ukir.dao;

import com.ukir.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {

    List<Book> getAllBook();

}
