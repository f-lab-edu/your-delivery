package com.ch.yourdelivery.interceptor;


import com.ch.yourdelivery.common.constant.DeliveryConstant;
import com.ch.yourdelivery.common.exception.DeliveryException;
import com.ch.yourdelivery.common.exception.ExceptionCode;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {

        HttpSession session = request.getSession();
        String email = session.getAttribute(DeliveryConstant.USER_SESSION_EMAIL).toString();

        if (email == null || email.isEmpty()) {
            throw new DeliveryException(email, ExceptionCode.BAD_REQUEST);
        }

        return true;
    }
}
