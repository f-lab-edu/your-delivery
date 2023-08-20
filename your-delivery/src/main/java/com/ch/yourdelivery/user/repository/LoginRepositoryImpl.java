package com.ch.yourdelivery.user.repository;

import com.ch.yourdelivery.user.domain.dto.UserRequest;
import com.ch.yourdelivery.user.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

    private final UserRepository userRepository;

    //DB정보를 통째로 넘겨주면 안될 것 같아서, Repository 통해, 특정 User Return
    final HashMap<String, User> userTable;

    public LoginRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        userTable = userRepository.getUserTable();
    }

    @Override
    public User getUserForLogin(UserRequest userRequest) {
       return userTable.get(userRequest.getEmail());
    }
}
