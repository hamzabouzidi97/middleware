package com.simulator.pi.dto.xmlElement;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "RequestPayload", namespace = "urn:bceao:pi:xsd:payload.1.0.0")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestPayload {


    @XmlElement(name = "AppHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private AppHdr appHdr;

    @XmlElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.03")
    private Document document;
}
