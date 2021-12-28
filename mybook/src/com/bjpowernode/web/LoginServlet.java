package com.bjpowernode.web;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import com.bjpowernode.service.imp.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImp();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(userService.loginUser(username, password) == null) {
            System.out.println("登陆失败");
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }


        req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);

    }
}

