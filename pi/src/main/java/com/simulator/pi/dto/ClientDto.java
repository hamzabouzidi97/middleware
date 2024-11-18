package com.simulator.pi.dto;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
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
