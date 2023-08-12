package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.common.exception.UserException;
import com.ch.yourdelivery.common.exception.ExceptionCode;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User emailSignUp(User user) {

        if (userRepository.findByEmail(user.getEmail()).getEmail()==null) {
            return userRepository.save(user);
        }else{
            throw new UserException(ExceptionCode.CONFLICT);
        }
    }
}
