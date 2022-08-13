package com.ukir.entity;

/**
 * @author ukir
 * @date 2022/08/11 11:27
 **/


import lombok.Data;

/**
 * 用户实体类
 */
@Data

public class User {
    private String userId;
    private String userName;
    private String userAccount;
    private Integer userPassword;
    private byte[] userImage;
}
