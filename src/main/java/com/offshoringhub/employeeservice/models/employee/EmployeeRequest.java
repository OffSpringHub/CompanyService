package com.offshoringhub.employeeservice.models.employee;


import com.offshoringhub.employeeservice.entities.Competence;
import com.offshoringhub.employeeservice.entities.Contact;
import com.offshoringhub.employeeservice.entities.Societe;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeRequest {
    Societe societe;

    private String nom;
    private String prenom;

    Contact contact;
    LocalDateTime date_naissace;
    int annéedexpérience;
}
