package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "societe")
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsociete", nullable = false)
    private Long idSociete;

    private String nomLegal;
    private String LogoLink;
    @OneToOne
    @JoinColumn(name = "id_contact")
    Contact contact;
}