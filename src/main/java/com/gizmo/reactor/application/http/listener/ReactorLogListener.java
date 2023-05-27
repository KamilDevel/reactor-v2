package com.gizmo.reactor.application.http.listener;

import com.gizmo.reactor.message.ReactorLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReactorLogListener {
    @KafkaListener(topics = "${spring.kafka.topic.reactor}", groupId = "${spring.kafka.group-id}")
    public void listenReactor(ReactorLog reactorLog) {
        log.warn("------------------------------------------------------------");
        log.warn("Received Message: " + reactorLog.getMessage());
        log.warn("------------------------------------------------------------");
    }
}
