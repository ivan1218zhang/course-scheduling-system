package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.ClassroomMapper;
import com.zyf.courseschedulingsystem.vo.ClassroomListReqVO;
import com.zyf.courseschedulingsystem.vo.ClassroomVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassroomService {
    @Resource
    private ClassroomMapper classroomMapper;
    public List<ClassroomVO> list(ClassroomListReqVO req) {
        return classroomMapper.list(req);
    }
}
