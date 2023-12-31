package com.zyf.courseschedulingsystem.controller;

import com.zyf.courseschedulingsystem.service.ClassService;
import com.zyf.courseschedulingsystem.vo.Resp;
import com.zyf.courseschedulingsystem.vo.ClassTimetableReqVO;
import com.zyf.courseschedulingsystem.vo.ClassListReqVO;
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
    public Resp list(ClassListReqVO req) {
        return Resp.success(classService.list(req));
    }
    @GetMapping("/timetable")
    public Resp timetable(ClassTimetableReqVO req) {
        return Resp.success(null);
    }
}
