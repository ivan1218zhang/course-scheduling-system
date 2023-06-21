package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.user.LoginReq;
import com.zyf.courseschedulingsystem.vo.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVO login(LoginReq req);
}
