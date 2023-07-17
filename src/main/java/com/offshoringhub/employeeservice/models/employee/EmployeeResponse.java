package com.offshoringhub.employeeservice.models.employee;

import com.offshoringhub.employeeservice.entities.Contact;
import com.offshoringhub.employeeservice.entities.Societe;
import lombok.*;

import java.time.LocalDateTime;


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder
    public class EmployeeResponse {
        Long idEmploye;
        Societe societe;

        private String nom;
        private String prenom;

        Contact contact;
        LocalDateTime date_naissace;
        int annéedexpérience;
    }


