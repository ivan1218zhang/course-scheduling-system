package com.zyf.courseschedulingsystem.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClassListReqVO {
    private Integer courseId;
    private List<Integer> lessonIdList;
}
