package com.simulator.pi.Service.implementation;

import com.simulator.pi.Service.IAliasService;
import com.simulator.pi.dto.AliasDto;
import com.simulator.pi.dto.command.AliasResponseDto;
import com.simulator.pi.dto.command.CreateAliasDto;
import com.simulator.pi.entity.Alias;
import com.simulator.pi.mapper.AliasMapper;
import com.simulator.pi.mapper.CreateAliasMapper;
import com.simulator.pi.repository.AliasRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AliasService implements IAliasService {

    private final AliasRepository aliasRepository;

    @Override
    public AliasResponseDto findAliasByCle(String cle) {
        Optional<Alias> alias = aliasRepository.findAliasByCle(cle);
        return alias.map(AliasMapper.INSTANCE::aliasToAliasDto).orElse(null);
    }

    @Override
    public void saveAlias(CreateAliasDto createAliasDto) {
        log.info("==> {}", createAliasDto.toString());
        Alias alias = CreateAliasMapper.INSTANCE.toAlias(createAliasDto);
        aliasRepository.save(alias);
    }
}
