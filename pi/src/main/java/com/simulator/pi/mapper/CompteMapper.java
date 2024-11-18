package com.simulator.pi.mapper;

import com.simulator.pi.dto.CompteDto;
import com.simulator.pi.entity.Compte;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompteMapper {

    CompteMapper INSTANCE = Mappers.getMapper(CompteMapper.class);

    CompteDto compteToCompteDto(Compte compte);

    Compte compteDtoToCompte(CompteDto compteDto);
}
