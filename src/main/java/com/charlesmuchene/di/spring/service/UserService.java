package com.charlesmuchene.di.spring.service;

import com.charlesmuchene.di.spring.domain.User;

public interface UserService {

    void save(User user);

    User findOne(long id);

}
