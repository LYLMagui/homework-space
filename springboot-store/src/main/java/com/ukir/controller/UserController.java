package com.ukir.controller;

import com.ukir.dao.UserDao;
import com.ukir.entity.Result;
import com.ukir.entity.User;
import com.ukir.util.Code;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * @author ukir
 * @date 2022/08/14 09:28
 **/
@Api(tags = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Result userLogin(@RequestParam("userAccount") String userAccount, @RequestParam("userPassword") String userPassword, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("登录账号：" + userAccount);
        System.out.println("密码：" + userPassword);
        //判断用户是否存在
        if (null != userDao.getUser(userAccount)) {
            User user = userDao.userLogin(userAccount, userPassword);
            if (Optional.ofNullable(user).isPresent()) {
                request.getSession().setAttribute("user", user);
                request.getSession().setMaxInactiveInterval(60 * 2);
                response.sendRedirect("/index.html");
                return new Result(Code.GET_OK, user, "登录成功");
            } else {
                System.out.println(Optional.ofNullable(userDao.userLogin(userAccount, userPassword)).get());
                response.sendRedirect("/login.html");
                return new Result(Code.GET_ERR, null, "账号或密码错误");
            }

        } else {
            return new Result(Code.GET_ERR, null, "用户不存在");
        }
    }

    @ApiOperation("用户注册")
    @PostMapping
    public Result userRegist(@RequestBody User user) {
        User user1 = userDao.getUser(user.getUserAccount());
        if (Optional.ofNullable(user1).isPresent()) {
            //用户已存在
            return new Result(Code.SAVE_ERR, null, "用户已存在");
        } else {
            int i = userDao.userRegist(user);
            if (i > 0) {
                return new Result(Code.SAVE_OK, null, "注册成功");
            } else {
                return new Result(Code.SAVE_ERR, null, "注册失败");
            }
        }
    }


}
