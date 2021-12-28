package com.bjpowernode.dao.daoImp;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.pojo.User;

public class UserDaoImp  extends  BaseDao  implements UserDao {


    @Override
    public User createName(String name) {

        String  sql = "select  id,username,password,email  from  t_user  where  username = ?";
        return queryForOne(User.class, sql, name);

    }



    @Override
    public User createNameAndPassword(String name, String password) {
        String  sql = "select  id,username,password,email  from  t_user  where  username = ?  and  password  = ?";

        return   queryForOne(User.class,sql,name,password);
    }



    @Override
    public int insertUser(User user) {

        String  sql  = "insert  into  t_user(username,password,email)  values (?,?,?)";


        return  updateUser(sql,user.getUsername(),user.getPassword(),user.getEmail());

    }

}















