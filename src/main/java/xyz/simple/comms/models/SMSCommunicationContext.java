package xyz.simple.comms.models;

import lombok.Getter;
import xyz.simple.comms.enums.SMSProvider;

@Getter
public class SMSCommunicationContext implements CommunicationContext {

    private PhoneNumber phoneNumber;
    private String message;
    private SMSProvider provider;

}
