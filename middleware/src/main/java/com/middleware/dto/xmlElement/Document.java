package com.middleware.dto.xmlElement;

import lombok.Data;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Document {

    @XmlElement(name = "IdVrfctnReq", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.03")
    private IdVrfctnReq idVrfctnReq;
}
