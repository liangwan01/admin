package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.utils.ServletFactory;
import com.bjpowernode.utils.myBatisUtil;

public class StudentServiceImpl  implements StudentService {

    private      StudentDao   studentDao = myBatisUtil.getSession().getMapper(StudentDao.class);



    @Override
    public Student selectOne(String id) {

        Student student = studentDao.selectOne(id);

        return student;
    }

    @Override
    public void save(Student student) {


        studentDao.save(student);

    }
}
