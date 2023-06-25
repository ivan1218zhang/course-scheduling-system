package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.AdminVO;
import com.zyf.courseschedulingsystem.vo.AdminLoginReqVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    AdminVO login(AdminLoginReqVO req);
}
