package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.clazz.ClassVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<ClassVO> list();
}
