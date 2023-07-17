package com.offshoringhub.employeeservice.models.addresse;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddresseResponse {
    private Long idAddresse;
    private String ville;
    private String rue;
    private  String numero;
    private String pays;
    private String zipCode;

}
