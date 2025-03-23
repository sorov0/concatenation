package com.centime.concatenationservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidJsonException.class)
    public ResponseEntity<String> handleInvalidJson(InvalidJsonException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
