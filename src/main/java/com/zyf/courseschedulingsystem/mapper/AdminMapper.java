package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.admin.AdminVO;
import com.zyf.courseschedulingsystem.vo.admin.LoginReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    AdminVO login(LoginReq req);
}
