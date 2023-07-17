package com.offshoringhub.employeeservice.models.societe;

import com.offshoringhub.employeeservice.entities.Contact;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SocieteResponse {
    private Long idSociete;
    private String nomLegal;
    private String logoLink;
    Contact contact;
}
