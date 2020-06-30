package com.baizhi;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.websocket.Session;
import java.io.Serializable;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
    public void test1() {
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(user);
    }

    @Test
    public void test2() {
        UserExample userExample = new UserExample();
        userExample.clear();


    }

    @Test
    public void test3() {
        String str = "index.jsp";
        String substring = str.substring(str.lastIndexOf("."));
        System.out.println(substring);
    }
    @Test
    public void test4(){
        Duration duration = Duration.ofMillis(100);
        System.out.println(duration.getSeconds());
    }
    @Test
    public void test5(){
        List<? extends Serializable> serializables = Arrays.asList(1, 2, 3, 4);

    }
@Test
    public void test6(){
    String uuid = UUID.randomUUID().toString().replace("-","");
    System.out.println(uuid);
}
@Test
    public void test7(){
        String sql="1231231241";
    String substring = sql.substring(0, sql.length() - 1);
    System.out.println(substring);
}

}
