package com.demo.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ljrstart
 * @create 2020-10-16-10:35
 */
public class MyUtils {


    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            System.out.println("获取sqlsessionFactory错误"+e);
            e.printStackTrace();
        }
    }

    // 获取SQLSession连接
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }


}
