package com.bjpowernode.junit;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StuTest {

    public static void main(String[] args) {

        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }


        SqlSessionFactory    sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession session = sessionFactory.openSession();

        Student getById = session.selectOne("getById", "002");
        System.out.println(getById);
        session.commit();
         session.close();

    }
}
