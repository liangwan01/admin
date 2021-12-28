package com.bjpowernode.Test;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.dao.daoImp.UserDaoImp;
import com.bjpowernode.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao  userDao = new UserDaoImp();

    @Test
    public void createName() {
    }

    @Test
    public void createNameAndPassword() {

        if(userDao.createNameAndPassword("张三","123456") != null){
            System.out.println("找到了");
        }else{
            System.out.println("找不到");
        }


    }

    @Test
    public void insertUser() {


        int i = userDao.insertUser(new User(null, "jklsasaas", "4564", "4564545"));
        System.out.println(i);

    }
}