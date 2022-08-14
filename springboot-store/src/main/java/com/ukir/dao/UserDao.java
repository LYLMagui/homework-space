package com.ukir.dao;

import com.ukir.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    /**
     * 获取用户
     *
     * @return
     */
    User getUser(@Param("userAccount") String userAccount);

    /**
     * 用户登录
     *
     * @return
     */
    User userLogin(@Param("userAccount") String userAccount, @Param("userPassword") String userPassword);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    int userRegist(User user);


}
