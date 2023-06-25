package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.UserMapper;
import com.zyf.courseschedulingsystem.util.EncodeUtil;
import com.zyf.courseschedulingsystem.vo.UserVO;
import com.zyf.courseschedulingsystem.vo.UserLoginReqVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public UserVO login(UserLoginReqVO req) throws Exception {
        // md5+base64加密密码
        req.setPassword(EncodeUtil.base64(EncodeUtil.md5(req.getPassword())));
        UserVO userVO = userMapper.login(req);
        if (null == userVO) {
            throw new Exception("用户登陆失败");
        }
        return userVO;
    }
}
