package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.model.User;

public interface UserRepository {

    User save(User user);

    User findByEmail(String email);

}
