package com.zyf.courseschedulingsystem.advice;

import com.zyf.courseschedulingsystem.vo.Resp;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"com.zyf.courseschedulingsystem.controller"})
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Resp handleException(Exception e) {
        e.printStackTrace();
        return Resp.error(e);
    }
}
