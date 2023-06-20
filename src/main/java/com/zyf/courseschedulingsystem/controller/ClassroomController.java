package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.classroom.ListReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    @GetMapping("/list")
    public Resp list(ListReq req) {
        return Resp.success(null);
    }
}
