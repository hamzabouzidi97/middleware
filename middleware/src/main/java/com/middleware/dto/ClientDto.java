package com.middleware.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientDto {

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
    private CompteDto compteDto;
}
