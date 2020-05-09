package com.example.demo.repository;

import com.example.demo.domain.User;

public interface UserDao {
    //用户登录
    int login(User user);
    //用户注册
    int register(User user);
    //修改失败次数
    int change_failtimes(User user);
    //

}
