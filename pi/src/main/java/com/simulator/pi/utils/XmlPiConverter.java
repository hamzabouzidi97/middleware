package com.simulator.pi.utils;

import com.simulator.pi.dto.xmlElement.RequestPayload;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class XmlPiConverter {

    public static RequestPayload deserializeXml(String xml) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RequestPayload.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (RequestPayload) unmarshaller.unmarshal(new StringReader(xml));
    }

}
