package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

public interface StudentDao {

    public Student getSelectOne(String  id);

    public  void  save(Student  s);



}
