package com.ch.yourdelivery.config;

import com.ch.yourdelivery.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration public class WebConfig implements WebMvcConfigurer {

    private final String[] excludePathSession;

    public WebConfig(@Value("${spring.excludePaths.session}") String[] excludePathSession) {
        this.excludePathSession = excludePathSession;
    }

    @Override public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(excludePathSession);
    }
}
