package com.bjpowernode.web;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import com.bjpowernode.service.imp.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {


    UserService  userService = new UserServiceImp();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email    = req.getParameter("email");
        String code    = req.getParameter("code");


//       检查 验证码
        if(!"abcde".equalsIgnoreCase(code)){
            System.out.println(  code + "验证码不正确");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
        }


//        检查用户名是否存在

        if(userService.queryUserName(username) == false){
            System.out.println(  username + "用户名已经存在");

            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
        }


//        添加用户
        User  user = new User(null,username,password,email);
        userService.registerUser(user);
        req.getRequestDispatcher("pages/user/regist_success.jsp").forward(req,resp);


    }
}



