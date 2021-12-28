package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StuTest {


    public static void main(String[] args) {

        String  str = "mybatis-config.xml";
        InputStream  inputStream = null;
        try {
             inputStream = Resources.getResourceAsStream(str);
        } catch (IOException e) {
            e.printStackTrace();
        }


        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();

        Student s = session.selectOne("selectId", "002");
        System.out.println(s);


        Student  student = new Student();

        student.setId("002");
        student.setName("kfjdsla;");
        student.setAge(99);

        int update = session.update("Test.update", student);

        session.commit();

        System.out.println(update);





    }
}
