package com.simulator.pi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AliasDto {

    private String type;
    private String cle;
    private ClientDto client;

}
