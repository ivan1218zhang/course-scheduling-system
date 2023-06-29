package com.zyf.courseschedulingsystem.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LessonTableVO {
    private Integer xq;
    private String title;
    private String content;
    private Integer start;
    private Integer end;
}
