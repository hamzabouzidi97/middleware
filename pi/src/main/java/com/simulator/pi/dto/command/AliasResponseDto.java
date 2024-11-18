package com.simulator.pi.dto.command;

import com.simulator.pi.dto.AliasDto;
import com.simulator.pi.dto.ClientDto;
import com.simulator.pi.dto.CompteDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AliasResponseDto {

    private ClientDto client;
    private CompteDto compte;
    private AliasDto alias;
}
