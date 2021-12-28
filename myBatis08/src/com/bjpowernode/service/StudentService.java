package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

public interface StudentService {

    public Student getSelectOne(String  id);

    public  void  save(Student  s);
}
