package com.hnglng.giving.web;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.domain.service.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import static org.junit.Assert.assertEquals;

/**
 * Created by huang_liang on 2017/2/23.
 */


public class GivingApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        assertEquals(20, u.getAge().intValue());
    }

}
