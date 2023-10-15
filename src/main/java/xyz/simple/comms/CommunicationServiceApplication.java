package xyz.simple.comms;

import xyz.simple.comms.service.CommunicationService;
import xyz.simple.comms.service.impl.TwilioCommunicationService;

public class CommunicationServiceApplication {

    public static void main(String[] args) {
        
        CommunicationService communicationService = new TwilioCommunicationService();
    }

}
