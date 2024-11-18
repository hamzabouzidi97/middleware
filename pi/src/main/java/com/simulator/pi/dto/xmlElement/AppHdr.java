package com.simulator.pi.dto.xmlElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AppHdr {

    @XmlElement(name = "Fr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private FIId fr;

    @XmlElement(name = "To", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private FIId to;

    @XmlElement(name = "BizMsgIdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private String bizMsgIdr;

    @XmlElement(name = "MsgDefIdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private String msgDefIdr;

    @XmlElement(name = "CreDt", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
    private String creDt;
}
