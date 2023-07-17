package com.offshoringhub.employeeservice.exceptions.restException;

import com.offshoringhub.employeeservice.exceptions.exceptionModel.NotFoundException;
import com.offshoringhub.employeeservice.models.exception.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage  EmployeeNotFoundHandler(NotFoundException addresseNotFoundException){
        return new ErrorMessage(HttpStatus.NOT_FOUND , addresseNotFoundException.getMessageErreur());
    }


}
