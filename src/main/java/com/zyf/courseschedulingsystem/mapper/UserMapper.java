package com.zyf.courseschedulingsystem.mapper;

import com.zyf.courseschedulingsystem.vo.UserLoginReqVO;
import com.zyf.courseschedulingsystem.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVO login(UserLoginReqVO req);
}
