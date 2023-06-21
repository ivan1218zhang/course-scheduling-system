package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.CourseService;
import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    private HttpServletRequest httpServletRequest;
    @Resource
    private CourseService courseService;
    @GetMapping("/list")
    public Resp list() throws Exception {
        HttpSession httpSession = httpServletRequest.getSession();
        Object o = httpSession.getAttribute("id");
        if (!(o instanceof Integer)) {
            throw new Exception("用户未登陆");
        }
        return Resp.success(courseService.list((Integer) o));
    }
}
