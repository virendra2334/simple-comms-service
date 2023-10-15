package xyz.simple.comms.models;

import lombok.Builder;
import lombok.Getter;
import xyz.simple.comms.enums.SMSProvider;

@Getter
@Builder
public class SMSCommunicationContext implements CommunicationContext {

    private PhoneNumber phoneNumber;
    private String message;
    private SMSProvider provider;

}
