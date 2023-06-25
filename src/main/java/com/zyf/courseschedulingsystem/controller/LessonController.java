package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.LessonService;
import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.LessonCreateReqVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/lesson")
public class LessonController {
    @Resource
    private HttpServletRequest httpServletRequest;
    @Resource
    private LessonService lessonService;
    @PostMapping("/crate")
    public Resp create(@RequestBody LessonCreateReqVO req) throws Exception {
        HttpSession httpSession = httpServletRequest.getSession();
        Object roleObject = httpSession.getAttribute("role");
        Object idObject = httpSession.getAttribute("id");
        if(!(roleObject instanceof String) || !(idObject instanceof Integer)) {
            throw new Exception("用户权限错误");
        }
        req.setUserId((Integer) idObject);
        return Resp.success(lessonService.create(req));
    }
}
