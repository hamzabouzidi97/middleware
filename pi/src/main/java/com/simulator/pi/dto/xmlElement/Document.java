package com.simulator.pi.dto.xmlElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Document {

    @XmlElement(name = "IdVrfctnReq", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.03")
    private IdVrfctnReq idVrfctnReq;
}
