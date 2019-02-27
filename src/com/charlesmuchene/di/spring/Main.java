package com.charlesmuchene.di.spring;

import com.charlesmuchene.di.spring.domain.User;
import com.charlesmuchene.di.spring.service.UserService;
import com.charlesmuchene.di.spring.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        User user = new User("Charles", 24);

        UserService userService = new UserServiceImpl();
        userService.save(user);

        System.out.println("******************************");

        User fetchedUser = userService.findOne(-1);
        System.out.println(fetchedUser);

    }
}
