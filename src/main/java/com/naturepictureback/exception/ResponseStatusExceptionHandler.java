package com.naturepictureback.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ResponseStatusExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RequestException.class)
    public ResponseEntity<Object> handleRequestException(RequestException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(exception.getErrorRequest().getCode());
        errorResponse.setMessage(exception.getErrorRequest().getMessage());
        errorResponse.setDetails(List.of(exception.getMessage()));

        return ResponseEntity
                .status(exception.getErrorRequest()
                .getCode()).body(errorResponse);

    }
}
