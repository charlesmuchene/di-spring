package com.charlesmuchene.di.spring.service.impl;

import com.charlesmuchene.di.spring.dao.UserDao;
import com.charlesmuchene.di.spring.domain.User;
import com.charlesmuchene.di.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findOne(long id) {
        return userDao.findOne(id);
    }
}
