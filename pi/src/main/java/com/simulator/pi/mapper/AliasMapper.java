package com.simulator.pi.mapper;

import com.simulator.pi.dto.AliasDto;
import com.simulator.pi.dto.ClientDto;
import com.simulator.pi.dto.CompteDto;
import com.simulator.pi.dto.command.AliasResponseDto;
import com.simulator.pi.dto.command.CreateAliasDto;
import com.simulator.pi.entity.Alias;
import com.simulator.pi.entity.Client;
import com.simulator.pi.entity.Compte;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ClientMapper.class, CompteMapper.class})
public interface AliasMapper {
    AliasMapper INSTANCE = Mappers.getMapper(AliasMapper.class);

    //AliasDto aliasToAliasDto(Alias alias);

    Alias aliasDtoToAlias(CreateAliasDto aliasDto);

    @Mapping(source = "client.compte", target = "compte")
    @Mapping(source = "client", target = "client")
    @Mapping(source = ".", target = "alias")
    AliasResponseDto aliasToAliasDto(Alias alias);

    //ClientDto clientToClientDto(Client client);

    //CompteDto compteToCompteDto(Compte compte);

    AliasDto aliasToAliasDtoWithoutResponse(Alias alias);
}


