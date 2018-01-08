package com.glqdlt.chatmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private static final Logger log = LoggerFactory.getLogger(ChatController.class);

    @MessageMapping("/chat")
    @SendTo("/push/chat")
    public ChatObject chatManager(ChatObject chatObject) {
        log.info(chatObject.getMessage());
        return chatObject;
    }

}
