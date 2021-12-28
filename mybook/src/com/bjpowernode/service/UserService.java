package com.bjpowernode.service;

import com.bjpowernode.pojo.User;

public interface UserService {

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    User loginUser(String name, String password);


    /**
     * 注册
     * @param user
     * @return
     */
    int  registerUser(User  user);


    /**
     * 查看用户名是否存在
     * @param name
     * @return
     */
    boolean  queryUserName(String  name);
}
