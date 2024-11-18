package com.middleware.clients;

import com.middleware.dto.Command.AliasResponseDto;
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

    @Value("${services.pi}/")
    private String piBaseUrl;

    public AliasResponseDto findAliasByCle(String cle){

        String url = UriComponentsBuilder
                .fromHttpUrl(piBaseUrl.concat("alias"))
                .queryParam("cle", cle)
                .toUriString();

        return restTemplate.getForObject(url, AliasResponseDto.class);
    }

    public ResponseEntity<Void> saveAlias(CreateAliasDto aliasDto) {
        String url = UriComponentsBuilder
                .fromHttpUrl(piBaseUrl.concat("alias"))
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<CreateAliasDto> request = new HttpEntity<>(aliasDto, headers);
        return restTemplate.postForEntity(url, request, Void.class);
    }


}
