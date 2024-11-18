package com.middleware.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestPayloadJson {

    private String senderName;
    private String senderId;
    private String receiverName;
    private String receiverId;
    private String bizMsgId;
    private String msgDefId;
    private String creationDate;
    private String partyName;
    private String countryOfResidence;
    private String accountId;
}
