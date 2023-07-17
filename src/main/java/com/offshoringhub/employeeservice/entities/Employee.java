package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEmployee", nullable = false)
    private Long idEmployee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "societe_idsociete")
    Societe societe;

    private String nom;
    private String prenom;
    @OneToOne
    @JoinColumn(name = "id_contact")
    Contact contact;
    LocalDateTime date_naissace;
    int annéedexpérience;

    @ManyToMany
    List<Competence> competences;


}