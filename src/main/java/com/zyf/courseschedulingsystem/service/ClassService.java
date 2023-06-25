package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.ClassMapper;
import com.zyf.courseschedulingsystem.vo.ClassVO;
import com.zyf.courseschedulingsystem.vo.ClassListReqVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassService {
    @Resource
    private ClassMapper classMapper;

    public List<ClassVO> list(ClassListReqVO req) {
        return classMapper.list(req);
    }
}
