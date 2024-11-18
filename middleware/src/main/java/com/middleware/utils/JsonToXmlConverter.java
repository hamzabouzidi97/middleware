package com.middleware.utils;

import com.middleware.dto.RequestPayloadJson;
import com.middleware.dto.xmlElement.*;

public class JsonToXmlConverter {

    public static RequestPayload convert(RequestPayloadJson jsonPayload) {
        RequestPayload xmlPayload = new RequestPayload();

        AppHdr appHdr = new AppHdr();
        appHdr.setFr(createFIId(jsonPayload.getSenderName(), jsonPayload.getSenderId()));
        appHdr.setTo(createFIId(jsonPayload.getReceiverName(), jsonPayload.getReceiverId()));
        appHdr.setBizMsgIdr(jsonPayload.getBizMsgId());
        appHdr.setMsgDefIdr(jsonPayload.getMsgDefId());
        appHdr.setCreDt(jsonPayload.getCreationDate());

        xmlPayload.setAppHdr(appHdr);

        Document document = new Document();
        IdVrfctnReq idVrfctnReq = new IdVrfctnReq();
        idVrfctnReq.setAssgnmt(createAssgnmt(jsonPayload));
        idVrfctnReq.setVrfctn(createVrfctn(jsonPayload));
        document.setIdVrfctnReq(idVrfctnReq);

        xmlPayload.setDocument(document);
        return xmlPayload;
    }

    private static FIId createFIId(String name, String id) {
        FIId fiId = new FIId();
        FinInstnId finInstnId = new FinInstnId();
        finInstnId.setNm(name);
        Other other = new Other();
        other.setId(id);
        finInstnId.setOthr(other);
        fiId.setFinInstnId(finInstnId);
        return fiId;
    }

    private static Assgnmt createAssgnmt(RequestPayloadJson jsonPayload) {
        Assgnmt assgnmt = new Assgnmt();
        assgnmt.setMsgId(jsonPayload.getBizMsgId());
        assgnmt.setCreDtTm(jsonPayload.getCreationDate());
        assgnmt.setAssgnr(createAgt(jsonPayload.getSenderName(), jsonPayload.getSenderId()));
        assgnmt.setAssgne(createAgt(jsonPayload.getReceiverName(), jsonPayload.getReceiverId()));
        return assgnmt;
    }

    private static Agt createAgt(String name, String id) {
        Agt agt = new Agt();
        agt.setFinInstnId(createFIId(name, id).getFinInstnId());
        return agt;
    }

    private static Vrfctn createVrfctn(RequestPayloadJson jsonPayload) {
        Vrfctn vrfctn = new Vrfctn();
        vrfctn.setId("GeneratedUniqueId");
        PtyAndAcctId ptyAndAcctId = new PtyAndAcctId();
        Pty pty = new Pty();
        pty.setNm(jsonPayload.getPartyName());
        pty.setCtryOfRes(jsonPayload.getCountryOfResidence());
        ptyAndAcctId.setPty(pty);

        Acct acct = new Acct();
        Other acctId = new Other();
        acctId.setId(jsonPayload.getAccountId());
        acct.setId(acctId);
        ptyAndAcctId.setAcct(acct);

        vrfctn.setPtyAndAcctId(ptyAndAcctId);
        return vrfctn;
    }
}
