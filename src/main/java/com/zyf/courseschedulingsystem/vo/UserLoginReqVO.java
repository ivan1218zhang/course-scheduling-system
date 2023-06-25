package com.zyf.courseschedulingsystem.vo;

import lombok.Data;

@Data
public class UserLoginReqVO extends Req {
    private String teacherId;
    private String password;
}
