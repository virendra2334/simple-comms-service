package xyz.simple.comms.service.impl;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import xyz.simple.comms.enums.SMSProvider;
import xyz.simple.comms.models.CommunicationContext;
import xyz.simple.comms.models.SMSCommunicationContext;
import xyz.simple.comms.service.SMSCommunicationService;

public class TwilioCommunicationService implements SMSCommunicationService {

    @Override
    public SMSCommunicationContext validateAndTransform(CommunicationContext context) {
        assert(context instanceof SMSCommunicationContext);
        SMSCommunicationContext smsContext = (SMSCommunicationContext) context;
        assert(SMSProvider.TWILIO.equals(smsContext.getProvider()));
        return smsContext;
    }

    public void communicate(SMSCommunicationContext context) {
        Message message = Message
                .creator(
                        new PhoneNumber("+9036191582"),
                        new PhoneNumber(context.getPhoneNumber().getRawPhoneNumber()),
                        "This is the ship that made the Kessel Run in fourteen parsecs?"
                )
                .create();
    }
}
