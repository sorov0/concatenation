package com.centime.concatenationservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public
class InvalidJsonException extends RuntimeException {
    private String message;
}
