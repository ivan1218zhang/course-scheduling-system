package com.zyf.courseschedulingsystem.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LessonListReqVO {
    private Integer classroomId;
    private Integer userId;
    private List<Integer> classIdList;
    private String time;
}
