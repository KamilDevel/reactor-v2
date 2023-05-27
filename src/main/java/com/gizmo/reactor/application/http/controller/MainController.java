package com.gizmo.reactor.application.http.controller;

import com.gizmo.reactor.infrastructure.service.ReactorLogService;
import com.gizmo.reactor.infrastructure.storage.entity.ReactorLogEntity;
import com.gizmo.reactor.message.ReactorLog;
import com.gizmo.reactor.message.SystemCommand;
import com.gizmo.reactor.message.SystemCommandArgument;
import com.gizmo.reactor.play.GoForMoney;
import com.gizmo.reactor.play.GoForPizza;
import com.gizmo.reactor.play.Vig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(path = MainController.MAIN_ENDPOINT)
public class MainController {
    public static final String MAIN_ENDPOINT = "/reactor";

    @GetMapping
    public String index() {
        return "index";
    }

    private final KafkaTemplate<String, SystemCommand> kafkaTemplateSystemCommand;
    private final KafkaTemplate<String, ReactorLog> kafkaTemplateReactorLog;
    private final ReactorLogService service;
    private final GoForMoney goForMoney;
    private final GoForPizza goForPizza;

    private final Vig vig;

    @GetMapping("/send")
    public String send() {
        var systemCommandMessage = SystemCommand.newBuilder();
        systemCommandMessage.setId(UUID.randomUUID())
               .setUser("badurk01")
               .setCommand("/usr/local/bin/presto")
               .setArguments(List.of(new SystemCommandArgument("path", "/var/www")));

        kafkaTemplateSystemCommand.send("command-inbound", systemCommandMessage.build());

        var reactorLogMessage = ReactorLog.newBuilder();
        reactorLogMessage.setId(UUID.randomUUID())
                .setUser("badurk01")
                .setMessage("The system just performed an Apache Kafka message");

        kafkaTemplateReactorLog.send("reactor-inbound", reactorLogMessage.build());

        Optional<ReactorLogEntity> test = service.getReactorLog(UUID.fromString("e2af74aa-1f9d-4cca-ac39-7e2985eb6097"));

        log.warn("------------------------------------------------------------");
        log.warn("Received Message: " + test.get().getMessage());
        log.warn("------------------------------------------------------------");

        goForMoney.go();
        goForPizza.go();
        vig.getGoForMoney().go();
        vig.getGoForPizza().go();

        return "index";
    }
}
