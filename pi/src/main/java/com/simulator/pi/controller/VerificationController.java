package com.simulator.pi.controller;

import com.simulator.pi.Service.ITransferService;
import com.simulator.pi.dto.xmlElement.RequestPayload;
import com.simulator.pi.dto.xmlElement.response.VerificationResponse;
import com.simulator.pi.utils.XmlPiConverter;
import jakarta.xml.bind.JAXBException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
@RequiredArgsConstructor
public class VerificationController {

    private final ITransferService transferService;

    @PostMapping(value = "/verifications-identites", produces = "application/xml")
    public ResponseEntity<VerificationResponse> verifyIdentity(@RequestBody String xmlPayload) throws JAXBException {

        System.out.println("Received XML: " + xmlPayload);

        boolean isValid = transferService.verification(xmlPayload);

        VerificationResponse response = new VerificationResponse();
        response.setIsValid(isValid);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    private boolean mockVerificationLogic(String xmlPayload) {
        // Add mock logic here: e.g., check for specific data in the payload
        return xmlPayload.contains("Mariama Traore"); // Example mock logic
    }

    private String generateMockResponse(boolean isValid) {
        if (isValid) {
            return "<VerificationResponse>\n" +
                    "   <Status>Valid</Status>\n" +
                    "   <Message>Verification successful. Identity is valid.</Message>\n" +
                    "</VerificationResponse>";
        } else {
            return "<VerificationResponse>\n" +
                    "   <Status>Invalid</Status>\n" +
                    "   <Message>Verification failed. Identity does not exist.</Message>\n" +
                    "</VerificationResponse>";
        }
    }
}
