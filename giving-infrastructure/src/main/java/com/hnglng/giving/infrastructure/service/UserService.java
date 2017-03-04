package com.hnglng.giving.infrastructure.service;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.infrastructure.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by huang_liang on 2017/3/4.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findUserby(String name){
        return userRepository.findByName(name);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}