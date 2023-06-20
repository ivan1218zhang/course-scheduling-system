package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.AdminService;
import com.zyf.courseschedulingsystem.vo.admin.LoginReq;
import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @PostMapping("/login")
    public Resp login(LoginReq req) {
        return Resp.success(null);
    }
}
