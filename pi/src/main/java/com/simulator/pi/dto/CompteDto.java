package com.simulator.pi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Builder
@ToString
public class CompteDto {

    private String participant;
    private String numero;
    private String type;
    private String agence;
    private LocalDateTime dateOuverture;
}
