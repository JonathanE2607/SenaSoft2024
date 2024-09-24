package com.senaSoft.SenaSoftBack.utilities;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException {
    private final HttpStatus httpStatus;
    //Controller with menssage and original exception
    public CustomException(String menssage, Exception e) {
        super(menssage, e);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR; //Default value
    }
    public CustomException(String menssage, HttpStatus httpStatus) {
        super(menssage);
        this.httpStatus = httpStatus;
    }
}
