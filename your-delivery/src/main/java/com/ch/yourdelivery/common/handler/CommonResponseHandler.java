package com.ch.yourdelivery.common.handler;

import com.ch.yourdelivery.common.model.BaseObject;
import com.ch.yourdelivery.common.model.ExceptionObject;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class CommonResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return returnType.getClass().isInstance(RestController.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //object 관련 작성

        //baseResponse 객체를 그 때 알려줬던 것처럼 만들고, 그다음에 여기서 어떻게 써서 리턴할 것인지 결정.
        return body instanceof BaseObject ? new BaseObject() : new ExceptionObject();
    }
}
