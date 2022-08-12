package com.ukir.entity;

/**
 * @author ukir
 * @date 2022/08/11 11:27
 **/

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 用户实体类
 */
@Data
@ApiModel(value = "用户对象",description = "图书")
public class User {
    private String userId;
    private String userName;
    private String userAccount;
    private Integer userPassword;
    private byte[] userImage;
}
