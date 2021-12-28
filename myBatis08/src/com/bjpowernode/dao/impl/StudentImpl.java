package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.myBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentImpl implements StudentDao {


    @Override
    public Student getSelectOne(String id) {

        SqlSession      session = myBatisUtil.getSession();

         Student  student = session.selectOne("Test.select",id);


        return  student;
    }

    @Override
    public void save(Student s) {

        SqlSession   session  = myBatisUtil.getSession();


        session.insert("Test.insert",s);




    }
}
