package com.middleware.controller;

import com.middleware.dto.AliasDto;
import com.middleware.dto.Command.CreateAliasDto;
import com.middleware.service.IAliasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alias")
@RequiredArgsConstructor
public class AliasController {

    private final IAliasService aliasService;

    @GetMapping
    public AliasDto findAliasByPhoneNumber(@RequestParam("cle") String cle){
        return aliasService.findAliasByCle(cle);
    }

    @PostMapping
    public ResponseEntity<Void> saveAlias(@RequestBody CreateAliasDto aliasDto){
        return aliasService.saveAlias(aliasDto);
    }


}
