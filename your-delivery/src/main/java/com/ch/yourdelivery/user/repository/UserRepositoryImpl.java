package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepositoryImpl implements UserRepository {

    final HashMap<String, User> userTable = new HashMap<String, User>();
    static long size = 0;

    @Override
    public User save(User user) throws Exception {

        String email = user.getEmail();
        user.setId((Long.valueOf(++size)));

        if (!userTable.containsKey(email)) {
            userTable.put(email, user);
        }else{
            throw new Exception("존재");
        }

        return user;
    }

    @Override
    public User findByEmail(String email) {

        if (userTable.containsKey(email)) {
            return userTable.get(email);
        }

        return new User();
    }
}
