package com.offshoringhub.employeeservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_addresse")
    private Addresse addresse;

}