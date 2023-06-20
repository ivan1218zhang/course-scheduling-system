package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.clazz.TimetableReq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassController {
    @GetMapping("/timetable")
    public Resp timetable(TimetableReq req) {
        return Resp.success(null);
    }
}
