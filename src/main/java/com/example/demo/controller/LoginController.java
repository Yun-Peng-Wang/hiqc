package com.example.demo.controller;


import com.example.demo.entity.SysUserEntity;
import com.example.demo.result.Login;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping(value = "login")
    @ResponseBody
    public Result<Login> login(@RequestBody SysUserEntity requestUser, HttpSession session) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String userName = requestUser.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
// 静态测试
//        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
//            String message = "账号密码错误";
//            System.out.println("test");
//            return new Result(400);
//        } else {
//            return new Result(200);
//        }
        SysUserEntity user = userService.get(userName, requestUser.getPassword());
        if(user == null){
            return new Result<Login>(400,"用户名密码错误！",null);
        } else{
//            session.setAttribute("user", user);
            Login data = new Login(user.getId(), user.getRoleId());
            Result<Login> result = new Result<>(200,"登录成功!",data);
            System.out.println(result.getData());
            return result;
        }
    }

    @CrossOrigin
    @PostMapping(value = "register")
    @ResponseBody
    public Result<Integer> register(@RequestBody SysUserEntity requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String userName = requestUser.getUserName();
        userName = HtmlUtils.htmlEscape(userName);

        boolean sign = userService.isExist(userName);
        if(!sign){
            SysUserEntity user = new SysUserEntity();
            user.setUserName(userName);
            user.setPassword(requestUser.getPassword());
            user.setRoleId(2);
            userService.add(user);
            return new Result<Integer>(200,"注册成功！",null);
        } else{
            return new Result<Integer>(400,"注册失败，该用户名已被注册！",null);
        }

    }

    @CrossOrigin
    @GetMapping(value = "routes")
    @ResponseBody
    public Result<Integer> routes(){
        return new Result<Integer>(200,null,null);
    }

}
