package com.simulator.pi.Service;

import com.simulator.pi.dto.AliasDto;
import com.simulator.pi.dto.command.AliasResponseDto;
import com.simulator.pi.dto.command.CreateAliasDto;

public interface IAliasService {

    AliasResponseDto findAliasByCle(String cle);

    void saveAlias(CreateAliasDto aliasDto);
}
