package com.ukir.entity;


import lombok.Data;

import java.util.Date;

/**
 * @author ukir
 * @date 2022/08/11 11:34
 **/

@Data

public class comment {
    private Integer commentId;
    private Integer userId;
    private Integer bookId;
    private String content;
    private Date commentDate;
}
