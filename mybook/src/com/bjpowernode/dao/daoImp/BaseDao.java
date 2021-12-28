package com.bjpowernode.dao.daoImp;

import com.bjpowernode.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    QueryRunner  queryRunner = new QueryRunner();


    /**
     * 增删改
     * @param sql
     * @param args
     * @return
     */
    public  int  updateUser(String  sql, Object...args){
        Connection conn  = JdbcUtils.getConnection();

        try {
            return  queryRunner.update(conn,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
         return -1;
    }


    /**
     * 查询结果是一条记录的
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public  <T>T   queryForOne(Class<T>  type,  String  sql,   Object... args  ){
        Connection  conn = JdbcUtils.getConnection();
        BeanHandler<T>  beanHandler  =  new  BeanHandler<T>(type);
        try {
            return queryRunner.query(conn, sql, beanHandler, args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
          return null;
    }


    /**
     * 查询结果是多条记录的
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public  <T> List<T> queryForList(Class<T>  type, String  sql, Object... args  ){
        Connection  conn = JdbcUtils.getConnection();
        BeanListHandler<T> beanHandler  =  new  BeanListHandler<T>(type);
        try {
            return queryRunner.query(conn, sql, beanHandler, args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }



    public  Object   queryValue(String  sql, Object...args){

        Connection  con = JdbcUtils.getConnection();

        ScalarHandler  scalarHandler = new ScalarHandler();

        try {
            return  queryRunner.query(con,sql,scalarHandler,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
          return null;

    }





}
