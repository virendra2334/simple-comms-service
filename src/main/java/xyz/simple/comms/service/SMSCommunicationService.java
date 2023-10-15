package xyz.simple.comms.service;

import xyz.simple.comms.models.CommunicationContext;
import xyz.simple.comms.models.SMSCommunicationContext;

public interface SMSCommunicationService extends CommunicationService {

    SMSCommunicationContext validateAndTransform(CommunicationContext context);
    default void communicate(CommunicationContext context) {
        SMSCommunicationContext smsContext = validateAndTransform(context);
        communicate(smsContext);
    }
    void communicate(SMSCommunicationContext context);
}
