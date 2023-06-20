package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.course.CreateReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    @PostMapping("/create")
    public Resp create(CreateReq req) {
        return Resp.success(null);
    }
}
