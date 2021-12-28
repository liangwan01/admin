package com.bjpowernode.service.imp;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.dao.daoImp.UserDaoImp;
import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;

public class UserServiceImp implements UserService {

    UserDao  userDao =  new UserDaoImp();

    @Override
    public User loginUser(String name, String password) {

        return userDao.createNameAndPassword(name,password);
    }

    @Override
    public int registerUser(User user) {

        return userDao.insertUser(user);
    }

    @Override
    public boolean queryUserName(String name) {


        if(  userDao.createName(name) != null){
            return false;
        } else{
            return true;
        }


    }
}
