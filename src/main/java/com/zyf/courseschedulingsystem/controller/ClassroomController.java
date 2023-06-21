package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.ClassroomService;
import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    @Resource
    private ClassroomService classroomService;
    @GetMapping("/list")
    public Resp list() {
        return Resp.success(classroomService.list());
    }
}
