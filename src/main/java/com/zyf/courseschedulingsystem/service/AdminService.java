package com.zyf.courseschedulingsystem.service;

import com.zyf.courseschedulingsystem.mapper.AdminMapper;
import com.zyf.courseschedulingsystem.util.EncodeUtil;
import com.zyf.courseschedulingsystem.vo.admin.AdminVO;
import com.zyf.courseschedulingsystem.vo.admin.LoginReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;
    public AdminVO login(LoginReq req) throws Exception {
        // md5+base64加密密码
        req.setPassword(EncodeUtil.base64(EncodeUtil.md5(req.getPassword())));
        AdminVO adminVO = adminMapper.login(req);
        if (null == adminVO) {
            throw new Exception("管理员登陆失败");
        }
        return adminVO;
    }
}
