package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.ClassVO;
import com.zyf.courseschedulingsystem.vo.ClassListReqVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<ClassVO> list(ClassListReqVO req);
}
