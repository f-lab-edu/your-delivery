package com.ch.yourdelivery.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collections;

@Component
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //ServletRequest는 범용적이기때문에, http와 관련된 객체로 Casting하여 사용
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        //Login API인 경우에만, Password 변경
        if (httpServletRequest.getHeader("For-Login") != null) {
            //SHA - 256 Util 추가 예정
        }

        //servlet container에 전달
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
