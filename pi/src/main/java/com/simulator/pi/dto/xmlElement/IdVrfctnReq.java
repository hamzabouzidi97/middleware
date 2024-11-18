package com.simulator.pi.dto.xmlElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class IdVrfctnReq {

    @XmlElement(name = "Assgnmt")
    private Assgnmt assgnmt;

    @XmlElement(name = "Vrfctn")
    private Vrfctn vrfctn;
}
