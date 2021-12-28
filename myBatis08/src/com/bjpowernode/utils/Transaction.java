package com.bjpowernode.utils;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Transaction  implements InvocationHandler {

    Object   target;

    public Transaction(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           Object  obj = null;
        SqlSession session = null;

        try {

            session  =  myBatisUtil.getSession();
            obj = method.invoke(target,args);

            session.commit();
        } catch (Exception e) {

            session.rollback();

            e.printStackTrace();
        } finally {
            myBatisUtil.closeSession(session);
        }

        return  obj;
    }

    public  Object  getProxy(){
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

}
