package com.gizmo.reactor.application.http.config;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
@RequiredArgsConstructor
public class KafkaTopicConfig {
    private final KafkaProperties kafkaProperties;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
        return new KafkaAdmin(configs);
    }

    @Bean("reactor-topic")
    public NewTopic reactorTopic() {
        return new NewTopic(kafkaProperties.getReactorTopic(), 1, (short) 1);
    }

    @Bean("command-topic")
    public NewTopic commandTopic() {
        return new NewTopic(kafkaProperties.getCommandTopic(), 1, (short) 1);
    }
}