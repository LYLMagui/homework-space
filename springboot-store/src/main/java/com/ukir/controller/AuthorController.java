package com.ukir.controller;

import com.ukir.entity.Author;
import com.ukir.entity.Result;
import com.ukir.service.AuthorService;
import com.ukir.util.Code;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ukir
 * @date 2022/08/14 10:39
 **/
@Api(tags = "作者")
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @ApiOperation("获取所有作者")
    @GetMapping
    public Result getAllAuthor() {
        List<Author> allAuthor = authorService.getAllAuthor();
        return new Result(Code.GET_OK, allAuthor, "查找成功", allAuthor.size());
    }

    @ApiOperation("通过姓名称查找作者")
    @GetMapping("/getByName/{authorName}")
    public Result getAuthorForName(@PathVariable String authorName) {
        List<Author> authorForName = authorService.getAuthorForName(authorName);
        return new Result(Code.GET_OK, authorForName, "查找成功", authorForName.size());
    }
}
