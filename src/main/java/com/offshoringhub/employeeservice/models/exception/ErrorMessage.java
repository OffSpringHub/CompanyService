package com.offshoringhub.employeeservice.models.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ErrorMessage {
    private HttpStatus status;
    private String message;
}
