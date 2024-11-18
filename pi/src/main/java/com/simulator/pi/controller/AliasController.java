package com.simulator.pi.controller;

import com.simulator.pi.Service.IAliasService;
import com.simulator.pi.dto.command.AliasResponseDto;
import com.simulator.pi.dto.command.CreateAliasDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alias")
@RequiredArgsConstructor
@Slf4j
public class AliasController {

    private final IAliasService aliasService;


    @GetMapping
    public ResponseEntity<AliasResponseDto> getAliasByCle(@RequestParam("cle") String cle){
        return ResponseEntity.status(HttpStatus.OK).body(aliasService.findAliasByCle(cle));
    }

    @PostMapping
    public ResponseEntity<Void> saveAlias(@RequestBody CreateAliasDto aliasDto){
        aliasService.saveAlias(aliasDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
