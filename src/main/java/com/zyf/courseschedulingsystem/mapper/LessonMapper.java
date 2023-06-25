package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.po.LessonClassRelationPO;
import com.zyf.courseschedulingsystem.po.LessonPO;
import com.zyf.courseschedulingsystem.vo.LessonCreateReqVO;
import com.zyf.courseschedulingsystem.vo.LessonListReqVO;
import com.zyf.courseschedulingsystem.vo.LessonVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LessonMapper {
    Integer create(LessonPO po);
    List<LessonVO> list(LessonListReqVO req);
    Integer createLessonClassRelation(LessonClassRelationPO po);
}
