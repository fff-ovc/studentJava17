package com.firstapp.helper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class HandleInputExceptions extends RuntimeException {

    public HandleInputExceptions(String message) {
        super(message);
    }

}

