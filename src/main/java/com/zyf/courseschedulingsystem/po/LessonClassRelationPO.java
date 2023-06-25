package com.zyf.courseschedulingsystem.po;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LessonClassRelationPO {
    private List<Integer> classIdList;
    private Integer lessonId;
    private String time;
}
