package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.impl.StudentImpl;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

public class StudentServiceImp  implements StudentService {

    private StudentDao studentdao = new StudentImpl();



    @Override
    public Student getSelectOne(String id) {

        Student s = studentdao.getSelectOne(id);
        return s;
    }




    @Override
    public void save(Student s) {


        studentdao.save(s);

    }


}
