package com.ukir.dao;

import com.ukir.entity.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ukir
 * @date 2022/08/14 10:16
 **/
@Mapper
public interface AuthorDao {


    /**
     * 获取所有作者信息
     *
     * @return
     */
    List<Author> getAllAuthor();

    /**
     * 获取单个作者的信息
     *
     * @return
     */
    Author getAuthor(Integer authorId);

    /**
     * 添加作者
     *
     * @return
     */
    int saveAuthor(Author author);

    /**
     * 通过姓名查找作者
     *
     * @return
     */
    List<Author> getAuthorForName(String authorName);
}
