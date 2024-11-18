package com.simulator.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String racine;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String adresse;
    private String paysResidence;
    private String nationalite;
    private String categorie;
    private String codePostale;
    private String identificationNationale;
    @OneToOne(cascade = CascadeType.ALL)
    private Compte compte;
}
