package com.ukir.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * @author ukir
 * @date 2022/08/11 11:18
 **/

/**
 * 图书实体类
 */
@Data
@ApiModel(value = "图书对象",description = "图书")
public class Book {
    //book_id 图书id
    private Integer bookId;
    //author_id 作者id
    private Integer authorId;
    //图书标题
    private String bookTitle;
    //图书简介
    private String bookInfo;
    //出版日期
    private Date publicationDate;
    //图书封面
    private byte[] bookImage;
    //图书价格
    private Double price;

}
