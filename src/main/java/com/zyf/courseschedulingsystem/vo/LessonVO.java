package com.zyf.courseschedulingsystem.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class LessonVO {
    private Integer lessonId;
    private Integer courseId;
    private String courseName;
    private Integer userId;
    private String userName;
    private Integer classroomId;
    private String classroomName;
    private List<String> classList;
    private String time;
}
