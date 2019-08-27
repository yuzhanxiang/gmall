package com.newasia.gmall.user.controller;

import com.newasia.gmall.user.bean.UserInfo;
import com.newasia.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> getUserInfoList(){ //ResponseEntity用于字符串转换
        List<UserInfo> userInfoList = userService.userInfoList();
        return ResponseEntity.ok(userInfoList);
    }
}
