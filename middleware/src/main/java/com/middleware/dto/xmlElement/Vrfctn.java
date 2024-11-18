package com.middleware.dto.xmlElement;

import lombok.Data;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Vrfctn {

    @XmlElement(name = "Id")
    private String id;

    @XmlElement(name = "PtyAndAcctId")
    private PtyAndAcctId ptyAndAcctId;
}