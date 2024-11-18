package com.middleware.dto.xmlElement;

import lombok.Data;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Pty {

    @XmlElement(name = "Nm")
    private String nm;

    @XmlElement(name = "CtryOfRes")
    private String ctryOfRes;
}
