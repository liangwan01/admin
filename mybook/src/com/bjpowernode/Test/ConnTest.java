package com.bjpowernode.Test;

import com.bjpowernode.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class ConnTest {



    @Test
    public  void  d(){
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);

            JdbcUtils.close(connection);
        }
    }


}
