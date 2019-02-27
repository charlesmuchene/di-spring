package com.charlesmuchene.di.spring.service.impl;

import com.charlesmuchene.di.spring.dao.UserDao;
import com.charlesmuchene.di.spring.domain.User;
import com.charlesmuchene.di.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findOne(long id) {
        return userDao.findOne(id);
    }
}
