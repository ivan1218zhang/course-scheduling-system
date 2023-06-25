package com.zyf.courseschedulingsystem.po;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LessonPO {
    private Integer id;
    private Integer courseId;
    private Integer classroomId;
    private String time;
}
