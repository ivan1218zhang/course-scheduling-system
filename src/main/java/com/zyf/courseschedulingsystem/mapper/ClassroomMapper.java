package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.ClassroomListReqVO;
import com.zyf.courseschedulingsystem.vo.ClassroomVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassroomMapper {
    List<ClassroomVO> list(ClassroomListReqVO req);
}
