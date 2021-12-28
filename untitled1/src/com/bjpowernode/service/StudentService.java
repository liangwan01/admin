package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

public interface StudentService {

    public Student selectOne(String id);

    public  void  save(Student student);


}
