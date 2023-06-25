package com.zyf.courseschedulingsystem.vo;

import lombok.Data;

import java.util.List;

@Data
public class LessonCreateReqVO extends Req {
    private Integer userId;
    private Integer courseId;
    private List<Integer> classIdList;
    private String lessonTime;
}
