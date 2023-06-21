package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.CourseMapper;
import com.zyf.courseschedulingsystem.vo.course.CourseVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;
    public List<CourseVO> list(Integer userId) {
        return courseMapper.list(userId);
    }
}
