package com.offshoringhub.employeeservice.models.societe;

import com.offshoringhub.employeeservice.entities.Contact;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SocieteRequest {
            private Long idSociete;
            private String nomLegal;
            private String logoLink;
            Contact contact;
}
