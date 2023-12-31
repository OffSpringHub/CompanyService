package com.offshoringhub.employeeservice.models.contact;

import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ContactResponse {
    private String Phone;
    private String email;
    private String siteweb;
    private AddresseResponse addresse;
}
