package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.user.LoginReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Resp login(LoginReq req) {
        return Resp.success(null);
    }
}
