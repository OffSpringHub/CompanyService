package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "competence")
public class Competence {
    @Id
    @Column(name = "id_competence", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idCompetence;

    @Column(name = "libelle", nullable = false, unique = true)
    private  String libelle;


}