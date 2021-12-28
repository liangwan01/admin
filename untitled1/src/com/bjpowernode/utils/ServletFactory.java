package com.bjpowernode.utils;

public class ServletFactory {

    public static Object getServlet(Object service) {
        return  new Transaction(service).getProxy();
    }



}
