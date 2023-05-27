package com.gizmo.reactor.application.http.listener;

import com.gizmo.reactor.message.SystemCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SystemCommandListener {
    @KafkaListener(topics = "${spring.kafka.topic.command}", groupId = "${spring.kafka.group-id}")
    public void listenCommand(SystemCommand systemCommand) {
        log.warn("------------------------------------------------------------");
        log.warn("Received Message: " + systemCommand.getUser());
        log.warn("------------------------------------------------------------");
    }
}
