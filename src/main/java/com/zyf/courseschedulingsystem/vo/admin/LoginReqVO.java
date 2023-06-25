package com.zyf.courseschedulingsystem.vo.admin;

import com.zyf.courseschedulingsystem.vo.Req;
import lombok.Data;

@Data
public class LoginReqVO extends Req {
    private String nickname;
    private String password;
}
