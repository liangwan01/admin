package com.bjpowernode.junit;

import com.bjpowernode.dao.impl.StudentImpl;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImp;
import com.bjpowernode.utils.ServletFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void getSelectOne() {

        StudentImpl  student = new StudentImpl();

        Student selectOne = student.getSelectOne("002");

        System.out.println(selectOne);

    }

    @Test
    public void save() {
        //StudentImpl  student = new StudentImpl();

       StudentService servlet = (StudentService) ServletFactory.getServlet(new StudentServiceImp());


        Student  s = new Student();
        s.setId("009");
        s.setName("ffff");
        s.setAge(33);
        servlet.save(s);



    }
}