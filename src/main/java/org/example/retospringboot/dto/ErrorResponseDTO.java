package org.example.retospringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponseDTO {
    private String error;
    private String message;
    Integer errorCode;
}