package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "social")
public class Socials {
    @Id
    @Column(name = "id_social", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSocial;

    @Column(name = "libelle")
    private  String libelle;

    @Column(name = "link")
    private String link;

}