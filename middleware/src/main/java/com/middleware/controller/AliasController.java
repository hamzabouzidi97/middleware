package com.middleware.controller;

import com.middleware.clients.AliasClient;
import com.middleware.clients.ApiClient;
import com.middleware.dto.Command.AliasResponseDto;
import com.middleware.dto.Command.CreateAliasDto;
import com.middleware.dto.RequestPayloadJson;
import com.middleware.dto.xmlElement.RequestPayload;
import com.middleware.service.IAliasService;
import com.middleware.utils.JsonToXmlConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.xml.bind.JAXBException;

@RestController
@RequestMapping("/alias")
@RequiredArgsConstructor
public class AliasController {

    private final IAliasService aliasService;

    private final ApiClient apiClient;

    @GetMapping
    public ResponseEntity<AliasResponseDto> getAliasByCle(@RequestParam("cle") String cle){
        return ResponseEntity.ok(aliasService.findAliasByCle(cle));
    }


    @PostMapping
    public ResponseEntity<Void> saveAlias(@RequestBody CreateAliasDto aliasDto){
        return aliasService.saveAlias(aliasDto);
    }

    @PostMapping("/forward-verification")
    public ResponseEntity<Boolean> forwardVerification(@RequestBody RequestPayloadJson jsonPayload) {
        try {
            // Convert JSON DTO to XML DTO
            RequestPayload xmlPayload = JsonToXmlConverter.convert(jsonPayload);

            // Send the XML payload to PI project
            Boolean piResponse = apiClient.sendRequest(xmlPayload);

            return ResponseEntity.ok(piResponse);
        } catch (JAXBException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(false);
        }
    }

}
