package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    final static List<User> list = new ArrayList<User>();

    @Override
    public User save(User user) {
        int size = list.size();
        user.setId((Long.valueOf(++size)));
        list.add(user);
        //print
        return user;
    }
}
