package com.zyf.courseschedulingsystem.vo;

import com.zyf.courseschedulingsystem.consts.RespCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resp {
    private Integer code;
    private Object data;
    public static Resp success(Object data) {
        return new Resp(RespCode.SUCCESS, data);
    }
}
