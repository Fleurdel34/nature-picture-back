package com.naturepictureback.exception;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
    private int status;
    private String message;
    private List<String> details;
}
