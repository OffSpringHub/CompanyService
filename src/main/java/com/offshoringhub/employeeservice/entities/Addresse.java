package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "addresse")

public class Addresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_addresse", nullable = false)
    private Long idAddresse;
    private String ville;
    private String rue;
    private  String numero;
    private String pays;
    private String zipCode;

}