package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.UserService;
import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.user.LoginReqVO;
import com.zyf.courseschedulingsystem.vo.user.UserVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private HttpServletRequest httpServletRequest;
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Resp login(@RequestBody LoginReqVO req) throws Exception {
        UserVO res = userService.login(req);
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.setAttribute("id", res.getId());
        httpSession.setAttribute("role", "user");
        return Resp.success(res);
    }
}
