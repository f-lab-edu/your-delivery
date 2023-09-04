package com.ch.yourdelivery.user.service;

import com.ch.yourdelivery.common.constant.DeliveryConstant;
import com.ch.yourdelivery.common.exception.DeliveryException;
import com.ch.yourdelivery.common.exception.ExceptionCode;
import com.ch.yourdelivery.user.domain.dto.LoginRequest;
import com.ch.yourdelivery.user.domain.model.User;
import com.ch.yourdelivery.user.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final HttpSession httpSession;

    public User sessionLogin(@RequestBody LoginRequest loginRequest) {

        User user = userRepository.findByEmail(loginRequest.getEmail());
        if (user == null) {
            throw new DeliveryException(user, ExceptionCode.BAD_REQUEST);
        }

        if (user.getPassword().equals(user.getPassword())) {
            httpSession.setAttribute(DeliveryConstant.USER_SESSION_EMAIL, user.getEmail());
            return user;
        } else {
            return null;
        }


    }
}
