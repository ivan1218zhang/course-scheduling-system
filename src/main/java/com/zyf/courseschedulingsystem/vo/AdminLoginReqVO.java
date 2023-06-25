package com.zyf.courseschedulingsystem.vo;

import lombok.Data;

@Data
public class AdminLoginReqVO extends Req {
    private String nickname;
    private String password;
}
