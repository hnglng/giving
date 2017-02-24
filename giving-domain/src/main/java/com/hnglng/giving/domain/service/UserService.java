package com.hnglng.giving.domain.service;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.domain.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by huang_liang on 2017/2/24.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findUserby(String name){
        return userMapper.findByName(name);
    }
}
