package com.skypro.testing.serice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalInvalidValue extends RuntimeException {
    public IllegalInvalidValue(String message) {
        super(message);
    }
}
