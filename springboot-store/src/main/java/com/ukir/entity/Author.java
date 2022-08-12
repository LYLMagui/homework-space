package com.ukir.entity;

/**
 * @author ukir
 * @date 2022/08/11 11:31
 **/

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 作者实体类
 */
@Data
@ApiModel(value = "作者对象",description = "图书")
public class Author {
    private String authorName;
    private String authorInfo;
    private String country;
    private Integer authorId;
}
