package com.simulator.pi.mapper;

import com.simulator.pi.dto.AliasDto;
import com.simulator.pi.dto.command.CreateAliasDto;
import com.simulator.pi.entity.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ClientMapper.class)
public interface AliasMapper {
    AliasMapper INSTANCE = Mappers.getMapper(AliasMapper.class);

    AliasDto aliasToAliasDto(Alias alias);

    Alias aliasDtoToAlias(CreateAliasDto aliasDto);
}


