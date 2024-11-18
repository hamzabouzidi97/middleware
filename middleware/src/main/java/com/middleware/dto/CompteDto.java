package com.middleware.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CompteDto {

    private String participant;
    private String numero;
    private String type;
    private String agence;
    private LocalDateTime dateOuverture;
}
