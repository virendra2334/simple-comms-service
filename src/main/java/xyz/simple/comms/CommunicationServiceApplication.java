package xyz.simple.comms;

import xyz.simple.comms.enums.SMSProvider;
import xyz.simple.comms.models.CommunicationContext;
import xyz.simple.comms.models.PhoneNumber;
import xyz.simple.comms.models.SMSCommunicationContext;
import xyz.simple.comms.service.CommunicationService;
import xyz.simple.comms.service.impl.TwilioCommunicationService;

public class CommunicationServiceApplication {

    public static void main(String[] args) {
        CommunicationService communicationService = new TwilioCommunicationService();
        CommunicationContext context = SMSCommunicationContext.builder()
                .message("test message")
                .phoneNumber(new PhoneNumber("+919902534751"))
                .provider(SMSProvider.TWILIO)
                .build();
        communicationService.communicate(context);
    }

}
