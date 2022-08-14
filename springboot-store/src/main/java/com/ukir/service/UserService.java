package com.ukir.service;

import com.ukir.entity.User;

/**
 * @author ukir
 * @date 2022/08/14 09:01
 **/
public interface UserService {

    /**
     * 获取用户
     *
     * @return
     */
    User getUser(String userAccount);

    /**
     * 用户登录
     *
     * @return
     */
    boolean userLogin(String userAccount, String password);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    boolean userRegist(User user);

}
