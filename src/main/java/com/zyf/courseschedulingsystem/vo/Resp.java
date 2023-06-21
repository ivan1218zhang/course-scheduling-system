package com.zyf.courseschedulingsystem.vo;

import com.zyf.courseschedulingsystem.constant.RespCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resp {
    private Integer code;
    private Object data;
    private String msg;
    public static Resp success(Object data) {
        return new Resp(RespCode.SUCCESS, data, "success");
    }

    public static Resp error(Exception e) {
        return new Resp(RespCode.ERROR, null, e.getMessage());
    }
}
