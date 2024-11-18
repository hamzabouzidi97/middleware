package com.middleware.clients;

import com.middleware.dto.xmlElement.RequestPayload;
import com.middleware.dto.xmlElement.response.VerificationResponse;
import com.middleware.utils.XmlUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.xml.bind.JAXBException;

@Service
@RequiredArgsConstructor
public class ApiClient {

    private final RestTemplate restTemplate;

    @Value("${services.pi}/transfer")
    private String piBaseUrl;

    public Boolean sendRequest(RequestPayload payload) throws JAXBException {
        RestTemplate restTemplate = new RestTemplate();

        // Convert payload to XML
        String xmlPayload = XmlUtil.toXml(payload);

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);

        // Create HTTP request
        HttpEntity<String> request = new HttpEntity<>(xmlPayload, headers);

        // Make POST request

        ResponseEntity<VerificationResponse> response = restTemplate.postForEntity(piBaseUrl.concat("/verifications-identites"),
                request,
                VerificationResponse.class);

        System.out.println("Response: " + response.getBody());
        return response.getBody().getIsValid();
    }
}
