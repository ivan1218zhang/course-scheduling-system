package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.AdminService;
import com.zyf.courseschedulingsystem.vo.AdminVO;
import com.zyf.courseschedulingsystem.vo.AdminLoginReqVO;
import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private HttpServletRequest httpServletRequest;
    @Resource
    private AdminService adminService;

    @PostMapping("/login")
    public Resp login(@RequestBody AdminLoginReqVO req) throws Exception {
        AdminVO res = adminService.login(req);
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.setAttribute("role", "admin");
        return Resp.success(res);
    }
}
