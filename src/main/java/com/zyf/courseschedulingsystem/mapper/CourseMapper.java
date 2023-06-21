package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.course.CourseVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<CourseVO> list(Integer userId);
}
