package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.ClassMapper;
import com.zyf.courseschedulingsystem.mapper.LessonMapper;
import com.zyf.courseschedulingsystem.po.LessonClassRelationPO;
import com.zyf.courseschedulingsystem.po.LessonPO;
import com.zyf.courseschedulingsystem.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class LessonService {
    @Resource
    private LessonMapper lessonMapper;
    @Resource
    private ClassMapper classMapper;
    @Transactional(isolation = Isolation.DEFAULT)
    public void create(LessonCreateReqVO req) throws Exception {
        // 检查这个教室这个时间是否被占用
        List<LessonVO> checkClassroom = lessonMapper.list(
                LessonListReqVO
                        .builder()
                        .classroomId(req.getClassroomId())
                        .time(req.getLessonTime())
                        .build()
        );
        if (checkClassroom.size() != 0) {
            throw new Exception("这个时间段教室已被占用");
        }
        // 检查这个时间用户是否有其他课
        List<LessonVO> checkUser = lessonMapper.list(
                LessonListReqVO
                        .builder()
                        .userId(req.getUserId())
                        .time(req.getLessonTime())
                        .build()
        );
        for (LessonVO lessonVO: checkUser) {
            if (!lessonVO.getCourseId().equals(req.getCourseId())) {
                throw new Exception("这个时间段您有其他课程");
            }
        }
        // 检查这个时间班级是否有其他课
        List<LessonVO> checkClass = lessonMapper.list(
                LessonListReqVO
                        .builder()
                        .classIdList(req.getClassIdList())
                        .time(req.getLessonTime())
                        .build()
        );
        if (checkClass.size() != 0) {
            throw new Exception("这个时间段班级有其他课程安排");
        }
        // 插入排课信息
        LessonPO lessonPO = LessonPO
                .builder()
                .courseId(req.getCourseId())
                .classroomId(req.getClassroomId())
                .time(req.getLessonTime())
                .build();
        lessonMapper.create(lessonPO);
        lessonMapper.createLessonClassRelation(LessonClassRelationPO
                .builder()
                .lessonId(lessonPO.getId())
                .classIdList(req.getClassIdList())
                .build());
    }

    public List<LessonVO> list(LessonListReqVO req) {
        List<LessonVO> lessonVOList = lessonMapper.list(req);
        if (lessonVOList.size() == 0){
            return lessonVOList;
        }
        // 装填班级信息
        // 根据lesson_id分类
        Map<Integer, LessonVO> lessonVOMap = lessonVOList.stream()
                .collect(Collectors.toMap(LessonVO::getLessonId, LessonVO-> LessonVO));
        // 根据lesson_id查出所有上课班级
        List<ClassVO> classVOList = classMapper.listClassAndLesson(ClassListReqVO
                .builder()
                .lessonIdList(new ArrayList<>(lessonVOMap.keySet()))
                .build());
        // 组合到lessonVOList中
        for (ClassVO classVO: classVOList) {
            LessonVO lessonVO = lessonVOMap.get(classVO.getLessonId());
            if (lessonVO.getClassList()==null){
                lessonVO.setClassList(new ArrayList<>());
            }
            List<String> list = lessonVO.getClassList();
            list.add(classVO.getName());
        }
        return lessonVOList;
    }
}
