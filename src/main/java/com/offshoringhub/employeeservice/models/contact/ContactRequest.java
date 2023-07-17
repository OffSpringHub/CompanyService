package com.offshoringhub.employeeservice.models.contact;

import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ContactRequest {
    private String Phone;
    private String email;
    private String siteweb;
    private AddresseRequest addresse;
}
