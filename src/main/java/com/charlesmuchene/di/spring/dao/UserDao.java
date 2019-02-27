package com.charlesmuchene.di.spring.dao;

import com.charlesmuchene.di.spring.domain.User;

public interface UserDao {

    void save(User user);

    User findOne(long id);

}
