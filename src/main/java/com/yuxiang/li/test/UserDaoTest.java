package com.yuxiang.li.test;

import com.yuxiang.li.dao.UserDao;
import com.yuxiang.li.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by yuxiang.li on 2018/12/6.
 */
public class UserDaoTest {
    @Test
    public void findUserById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
      List<User> user = userMapper.findAllUsers();
      List<User> user2 = distant(user);

        System.out.println(user.size());
       Assert.assertNotNull("没找到数据", user);
        User user1 = new User();
        user1.setAge(12);
        user1.setDeleteFlag(1);
        user1.setName("li1");
        User user3=new User();
        user3.setAge(12);
        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user3);
      //  int id = userMapper.insertUser(user1);
        sqlSession.commit();
        System.out.println(user1.getId());


    }

    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                    .getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;

    }

    @Test
    public void time() {
        System.out.println(new SimpleDateFormat("YYYY-MM-dd HH:mm:SS").format(new Date()));
    }

    public List<User> distant(List<User> list)
    {
        Set<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.addAll(list);

        return new ArrayList<User>(set);
    }
}
