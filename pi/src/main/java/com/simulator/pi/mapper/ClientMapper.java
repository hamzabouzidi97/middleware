package com.simulator.pi.mapper;

import com.simulator.pi.dto.ClientDto;
import com.simulator.pi.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CompteMapper.class)
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDto clientToClientDto(Client client);

    Client clientDtoToClient(ClientDto clientDto);


}
