package com.simulator.pi.mapper;

import com.simulator.pi.dto.command.CreateAliasDto;
import com.simulator.pi.entity.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {AliasMapper.class, ClientMapper.class, CompteMapper.class})
public interface CreateAliasMapper {

    CreateAliasMapper INSTANCE = Mappers.getMapper(CreateAliasMapper.class);

    @Mapping(source = "client", target = "client")
    @Mapping(source = "compte", target = "client.compte")
    @Mapping(source = "alias.type", target = "type")
    @Mapping(source = "alias.cle", target = "cle")
    Alias toAlias(CreateAliasDto createAliasDto);
}
