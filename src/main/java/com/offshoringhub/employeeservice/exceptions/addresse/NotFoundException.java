package com.offshoringhub.employeeservice.exceptions.addresse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotFoundException extends RuntimeException{
    String codeErreur;
    String messageErreur;


    public NotFoundException(String message){
        super(message);
        messageErreur = message;

    }
}
