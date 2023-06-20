package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.vo.admin.LoginReq;
import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @PostMapping("/login")
    public Resp login(LoginReq req) {
        return Resp.success(null);
    }
}
