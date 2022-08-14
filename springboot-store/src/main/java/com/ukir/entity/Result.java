package com.ukir.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ukir
 **/

//封装返回结果
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer code; //返回的状态码
    private Object data; //返回的数据
    private String msg; // 返回的消息
    private Integer count; // 返回的记录数

    public Result(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

}
