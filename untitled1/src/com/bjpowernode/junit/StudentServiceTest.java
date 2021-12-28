package com.bjpowernode.junit;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.utils.ServletFactory;
import com.bjpowernode.utils.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void selectOne() {

        StudentService    ss = (StudentService) ServletFactory.getServlet(new StudentServiceImpl());


        Student s = ss.selectOne("002");
        System.out.println(s );


    }

    @Test
    public void save() {
    }
}