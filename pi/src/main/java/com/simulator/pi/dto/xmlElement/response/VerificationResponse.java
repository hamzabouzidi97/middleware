package com.simulator.pi.dto.xmlElement.response;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "VerificationResponse")
public class VerificationResponse {
    private Boolean isValid;
}
