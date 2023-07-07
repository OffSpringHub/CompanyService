package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idContact", nullable = false)
    private Long idContact;

    private String Phone;
    private String email;
    private String siteweb;
    @ManyToOne
    @JoinColumn(name = "id_addresse")
    private Addresse addresse;

}