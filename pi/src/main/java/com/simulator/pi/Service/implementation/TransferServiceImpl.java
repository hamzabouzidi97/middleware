package com.simulator.pi.Service.implementation;

import com.simulator.pi.Service.ITransferService;
import com.simulator.pi.dto.xmlElement.RequestPayload;
import com.simulator.pi.entity.Alias;
import com.simulator.pi.repository.AliasRepository;
import com.simulator.pi.utils.XmlPiConverter;
import jakarta.xml.bind.JAXBException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TransferServiceImpl implements ITransferService {

   private final AliasRepository aliasRepository;

    @Override
    public boolean verification(String verificationPayload) throws JAXBException {
        RequestPayload requestPayload = XmlPiConverter.deserializeXml(verificationPayload);
        String extractedId = requestPayload.getDocument()
                .getIdVrfctnReq()
                .getVrfctn()
                .getPtyAndAcctId()
                .getAcct()
                .getId()
                .getId();
        System.out.println("Extracted Id: " + extractedId);
        Optional<Alias>  alias = aliasRepository.findAliasByCle(extractedId);
        return alias.isPresent();
    }
}
