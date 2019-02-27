package com.charlesmuchene.di.spring.dao.impl;

import com.charlesmuchene.di.spring.dao.UserDao;
import com.charlesmuchene.di.spring.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.printf("We have saved user %s\n", user);
    }

    @Override
    public User findOne(long id) {
        System.out.printf("Finding user with id %d\n", id);
        return new User("Charles", 24);
    }
}
