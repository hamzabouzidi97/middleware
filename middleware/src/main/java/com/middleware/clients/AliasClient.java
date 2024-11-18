package com.middleware.clients;

import com.middleware.dto.AliasDto;
import com.middleware.dto.Command.CreateAliasDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
public class AliasClient {

    private final RestTemplate restTemplate;

    @Value("${services.pi}/alias")
    private String piBaseUrl;

    public AliasDto findAliasByCle(String cle){

        String url = UriComponentsBuilder
                .fromHttpUrl(piBaseUrl)
                .queryParam("cle", cle)
                .toUriString();

        return restTemplate.getForObject(url, AliasDto.class);
    }

    public ResponseEntity<Void> saveAlias(CreateAliasDto aliasDto) {
        String url = UriComponentsBuilder
                .fromHttpUrl(piBaseUrl)
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<CreateAliasDto> request = new HttpEntity<>(aliasDto, headers);
        return restTemplate.postForEntity(url, request, Void.class);
    }

}
