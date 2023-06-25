package com.zyf.courseschedulingsystem.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class LessonCreateReqVO extends Req {
    private Integer userId;
    @NotNull(message = "courseId不能为空")
    private Integer courseId;
    @NotNull(message = "classroomId不能为空")
    private Integer classroomId;
    @NotEmpty(message = "classIdList不能为空")
    private List<Integer> classIdList;
    @NotNull(message = "courseId不能为空")
    private String lessonTime;
}
