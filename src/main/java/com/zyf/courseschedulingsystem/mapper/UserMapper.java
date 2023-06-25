package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.user.LoginReqVO;
import com.zyf.courseschedulingsystem.vo.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVO login(LoginReqVO req);
}
