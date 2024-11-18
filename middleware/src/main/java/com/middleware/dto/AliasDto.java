package com.middleware.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AliasDto {

    private String type;
    private String cle;
    private ClientDto clientDto;
}
