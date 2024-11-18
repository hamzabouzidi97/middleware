package com.middleware.dto.Command;

import com.middleware.dto.AliasDto;
import com.middleware.dto.ClientDto;
import com.middleware.dto.CompteDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class
CreateAliasDto {
    private ClientDto client;
    private CompteDto compte;
    private AliasDto alias;
}
