package com.zyf.courseschedulingsystem.vo.user;

import com.zyf.courseschedulingsystem.vo.Req;
import lombok.Data;

@Data
public class LoginReq extends Req {
    private String teacherId;
    private String password;
}
