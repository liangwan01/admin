package com.bjpowernode.dao;

import com.bjpowernode.pojo.User;

public interface UserDao {

    /**
     * 更具用户名查
     * @param name
     * @return
     */
    User  createName(String  name);


    /**
     * 更具用户名和密码查
     * @param name
     * @param password
     * @return
     */
    User  createNameAndPassword(String  name, String  password);


    /**
     * 添加用户
     * @param user
     * @return
     */
    int  insertUser(User  user);

}
