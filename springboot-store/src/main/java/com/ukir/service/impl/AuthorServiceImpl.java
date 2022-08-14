package com.ukir.service.impl;

import com.ukir.dao.AuthorDao;
import com.ukir.entity.Author;
import com.ukir.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ukir
 * @date 2022/08/14 10:33
 **/
@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorDao authorDao;


    /**
     * 获取所有作者信息
     *
     * @return
     */
    @Override
    public List<Author> getAllAuthor() {
        return authorDao.getAllAuthor();
    }

    /**
     * 获取单个作者的信息
     *
     * @return
     */
    @Override
    public Author getAuthor(Integer authorId) {
        return authorDao.getAuthor(authorId);
    }

    /**
     * 添加作者
     *
     * @param author
     * @return
     */
    @Override
    public int saveAuthor(Author author) {
        return authorDao.saveAuthor(author);
    }

    /**
     * 通过姓名查找作者
     *
     * @param authorName
     * @return
     */
    @Override
    public List<Author> getAuthorForName(String authorName) {
        return authorDao.getAuthorForName(authorName);
    }
}
