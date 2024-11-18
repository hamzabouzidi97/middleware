package com.middleware.service.implementation;

import com.middleware.clients.AliasClient;
import com.middleware.dto.AliasDto;
import com.middleware.dto.Command.CreateAliasDto;
import com.middleware.service.IAliasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AliasService implements IAliasService {

    private final AliasClient aliasClient;

    @Override
    public AliasDto findAliasByCle(String cle) {
        return aliasClient.findAliasByCle(cle);
    }

    @Override
    public ResponseEntity<Void> saveAlias(CreateAliasDto aliasDto){
        ResponseEntity<Void> response = aliasClient.saveAlias(aliasDto);
        if(response.getStatusCode().is2xxSuccessful()){
           log.info("Alias saved successfully!");
           return ResponseEntity.status(HttpStatus.CREATED).build();
        }else{
            log.error("Failed to save alias.");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
