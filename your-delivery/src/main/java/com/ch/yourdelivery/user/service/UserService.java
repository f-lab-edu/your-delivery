package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * com.ch.yourdelivery.user.service
 * UserService
 *
 * @author : ted
 * @date : 2023/07/10
 * @tags :
 */
@Service
@RequiredArgsConstructor
public class UserService {

//    private final UserRepository userRepository;

    public String saveUser(User user){
//        userRepository.insertUser(user);
        return "id";
    }
}
