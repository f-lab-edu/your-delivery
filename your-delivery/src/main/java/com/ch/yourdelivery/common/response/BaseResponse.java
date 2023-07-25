package com.ch.yourdelivery.common.response;

import com.ch.yourdelivery.common.model.BaseObject;
import org.springframework.http.HttpStatus;

public class BaseResponse extends BaseObject {
    private static final String SUCCESS= "success";
    private static final String FAIL = "FAIL";
    String result;
    Object body;

    public BaseResponse(Object body) {
        super();
        this.body = body;
        this.result = SUCCESS;
    }

    public BaseResponse() {
        super();
        this.result = FAIL;
    }
}
