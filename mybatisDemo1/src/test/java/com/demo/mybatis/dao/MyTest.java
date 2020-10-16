package com.demo.mybatis.dao;

import com.demo.mybatis.pojo.User;
import com.demo.mybatis.utils.MyUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ljrstart
 * @create 2020-10-16-14:56
 */
public class MyTest {

    @Test
    public void test(){
        //获取SqlSession对象
        SqlSession sqlSession = MyUtils.getSqlSession();
        //方式一： getMapper方式
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }
}
