package com.ukir.controller;

import com.ukir.entity.Book;
import com.ukir.entity.Result;
import com.ukir.service.BookService;
import com.ukir.util.Code;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author ukir
 * @date 2022/08/13 10:17
 **/
@RestController
@RequestMapping("/book")
@Api(tags = "图书")
public class BookController {
    @Autowired
    private BookService bookService;

    @ApiOperation("获取全部图书")
    @GetMapping
    public Result getAllBook() {
        if (Optional.ofNullable(bookService).isPresent()) {
            List<Book> allBook = bookService.getAllBook();
            return new Result(Code.GET_OK, allBook, "查询成功", allBook.size());
        } else {
            System.out.println(Optional.ofNullable(bookService).get());
            return null;
        }
    }

    @PostMapping
    @ApiOperation("添加图书")
    public Result saveBook(@RequestBody Book book) {
        boolean b = bookService.saveBook(book);
        if (b) {
            return new Result(Code.SAVE_OK, null, "添加成功");
        } else {
            return new Result(Code.SAVE_ERR, null, "添加失败");
        }
    }

}
