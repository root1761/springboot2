package com.baizhi;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2ApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setId("1");
        user.setUsername("李四");
        user.setPassword("000000");
        int i = userMapper.insertSelective(user);

    }
    @Test
    public void test1(){
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(user);
    }
    @Test
    public void test2(){
        UserExample userExample=new UserExample();
        userExample.clear();


    }

}
