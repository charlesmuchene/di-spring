package com.charlesmuchene.di.spring;

import com.charlesmuchene.di.spring.domain.User;
import com.charlesmuchene.di.spring.service.UserService;
import com.charlesmuchene.di.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        User user = new User("Charles", 24);

        String contextLocation = "context/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextLocation);

        UserService userService = context.getBean(UserService.class);
        userService.save(user);

        System.out.println("******************************");

        User fetchedUser = userService.findOne(-1);
        System.out.println(fetchedUser);

    }
}
