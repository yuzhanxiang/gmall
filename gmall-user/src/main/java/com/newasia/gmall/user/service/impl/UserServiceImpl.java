package com.newasia.gmall.user.service.impl;

import com.newasia.gmall.user.bean.UserInfo;
import com.newasia.gmall.user.mapper.UserInfoMapper;
import com.newasia.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
