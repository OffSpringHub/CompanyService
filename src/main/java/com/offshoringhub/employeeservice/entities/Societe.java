package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "societe")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsociete", nullable = false)
    private Long idSociete;

    private String nomLegal;
    private String logoLink;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contact")
    Contact contact;
}