package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

public interface StudentDao {

    public Student selectOne(String id);


    public  void  save(Student  student);


}
