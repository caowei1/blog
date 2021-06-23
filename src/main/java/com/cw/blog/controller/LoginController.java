package com.cw.blog.controller;

import com.cw.blog.eneity.CommonResult;
import com.cw.blog.eneity.User;
import com.cw.blog.service.UserService;
import com.cw.blog.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login1")
    public CommonResult login(@RequestParam String username,
                              @RequestParam  String password,
                              HttpSession session){
        User user = userService.checkUser(username, MD5.GetMD5Code(password));
        if(user != null){
            session.setAttribute("user",user);
            return new CommonResult(200,"账户密码正确",user);
        }else {
            return new CommonResult(500,"账号密码错误",null);
        }
    }
    @RequestMapping("/login")
    public CommonResult login(@RequestBody User user){
        User user1 = userService.checkUser(user.getUsername(), MD5.GetMD5Code(user.getPassword()));
        if(user1 != null){
            return new CommonResult(200,"账户密码正确",user1);
        }else {
            return new CommonResult(500,"账号密码错误",null);
        }
    }

    public CommonResult logout(HttpSession session){
        session.removeAttribute("user");
        return new CommonResult(200,"退出成功",null);
    }
}
