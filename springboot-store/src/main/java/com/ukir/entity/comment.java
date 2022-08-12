package com.ukir.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * @author ukir
 * @date 2022/08/11 11:34
 **/

@Data
@ApiModel(value = "评论对象",description = "图书")
public class comment {
    private Integer commentId;
    private Integer userId;
    private Integer bookId;
    private String content;
    private Date commentDate;
}
