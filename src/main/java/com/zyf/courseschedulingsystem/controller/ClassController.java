package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.ClassService;
import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.clazz.TimetableReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Resource
    private ClassService classService;
    @GetMapping("/list")
    public Resp list() {
        return Resp.success(classService.list());
    }
    @GetMapping("/timetable")
    public Resp timetable(TimetableReq req) {
        return Resp.success(null);
    }
}
