package com.ukir.service.impl;

import com.ukir.dao.UserDao;
import com.ukir.entity.User;
import com.ukir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ukir
 * @date 2022/08/13 10:08
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    /**
     * 获取用户
     *
     * @param userAccount
     * @return
     */
    @Override
    public User getUser(String userAccount) {
        return userDao.getUser(userAccount);
    }

    /**
     * 用户登录
     *
     * @param userAccount
     * @param password
     * @return
     */
    @Override
    public boolean userLogin(String userAccount, String password) {
        User user1 = userDao.userLogin(userAccount, password);
        //登录成功
        //账号或密码错误
        return null != user1;
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public boolean userRegist(User user) {
        int i = userDao.userRegist(user);
        //注册成功
        //注册失败
        return i > 0;
    }
}
