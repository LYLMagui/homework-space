package com.ukir.entity;

/**
 * @author ukir
 * @date 2022/08/11 11:31
 **/


import lombok.Data;

/**
 * 作者实体类
 */
@Data

public class Author {
    private String authorName;
    private String authorInfo;
    private String country;
    private Integer authorId;
}
