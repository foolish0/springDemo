package com.example.demo.democode.repository;

import com.example.demo.democode.entity.User;

public interface UserDao {
    /**
     * 用户登录
     * @param user
     * @return
     */
    int login(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int register(User user);

    /**
     * 修改失败次数
     * @param user
     * @return
     */
    int changeFailtimes(User user);
}
