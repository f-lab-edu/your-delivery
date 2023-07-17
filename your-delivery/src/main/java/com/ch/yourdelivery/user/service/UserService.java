package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
