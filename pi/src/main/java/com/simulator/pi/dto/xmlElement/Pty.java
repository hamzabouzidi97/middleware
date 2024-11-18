package com.simulator.pi.dto.xmlElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Pty {

    @XmlElement(name = "Nm")
    private String nm;

    @XmlElement(name = "CtryOfRes")
    private String ctryOfRes;
}
