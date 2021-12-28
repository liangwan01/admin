package com.bjpowernode.Test;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import com.bjpowernode.service.imp.UserServiceImp;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService  userService = new UserServiceImp();

    @Test
    public void loginUser() {

        if(userService.loginUser("张三","123456") != null){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }

    }

    @Test
    public void registerUser() {
        User user = new  User(null,"ljkljklj","42dss","f4d5s");
        if(userService.registerUser(user) > 0 ){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }

    }




    @Test
    public void queryUserName() {

        if(userService.queryUserName("张三") == true) {
            System.out.println("可以添加");
        }else{
            System.out.println("不可以添加");
        }


    }
}