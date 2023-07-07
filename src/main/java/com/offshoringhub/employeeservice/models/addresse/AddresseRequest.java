package com.offshoringhub.employeeservice.models.addresse;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddresseRequest {
    private String ville;
    private String rue;
    private  String numero;
    private String pays;
    private String zipCode;
}
