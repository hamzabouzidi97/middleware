package com.middleware.service;

import com.middleware.dto.AliasDto;
import com.middleware.dto.Command.AliasResponseDto;
import com.middleware.dto.Command.CreateAliasDto;
import org.springframework.http.ResponseEntity;

public interface IAliasService{

    AliasResponseDto findAliasByCle(String cle);

    ResponseEntity<Void> saveAlias(CreateAliasDto aliasDto);

}
