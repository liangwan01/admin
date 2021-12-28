package com.bjpowernode.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class myBatisUtil {

    private  static SqlSessionFactory    sessionFactory;

    private  myBatisUtil(){

    }

    static {

        String  config  = "mybatis-config.xml";
        InputStream inputStream = null;

        try {
            inputStream =  Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }

     sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }


    private  static  ThreadLocal<SqlSession>    t = new ThreadLocal<>();


    public static SqlSession getSession() {

        SqlSession session = t.get();
        if (session == null) {
            session = sessionFactory.openSession();
            t.set(session);
        }

          return   session;
    }


    public  static  void  closeSession(SqlSession   session){
        session.close();
        t.remove();
    }

}
