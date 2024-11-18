package com.simulator.pi.Service;

import jakarta.xml.bind.JAXBException;

public interface ITransferService {

    boolean verification(String verificationPayload) throws JAXBException;
}
