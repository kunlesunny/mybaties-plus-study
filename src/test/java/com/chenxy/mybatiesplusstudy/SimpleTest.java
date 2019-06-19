package com.chenxy.mybatiesplusstudy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenxy.mybatiesplusstudy.dao.UserMapper;
import com.chenxy.mybatiesplusstudy.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age",21);
        List<User> list = userMapper.selectList(queryWrapper);
//        Assert.assertEquals(4,list.size());
        list.forEach(System.out::println);
    }
}
