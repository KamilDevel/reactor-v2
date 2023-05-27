package com.gizmo.reactor.application.http.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@Getter
public class KafkaProperties {
    @Value("${spring.kafka.bootstrap-servers}")
    String bootstrapServers;

    @Value("${spring.kafka.schema.registry.url}")
    String registryUrl;

    @Value("${spring.kafka.topic.reactor}")
    String reactorTopic;

    @Value("${spring.kafka.topic.command}")
    String commandTopic;

    @Value("${spring.kafka.group-id}")
    String groupId;

    @Value("${spring.kafka.autoCommit}")
    String autoCommit;

    @Value("${spring.kafka.retries}")
    String retries;

    @Value("${spring.kafka.reconnectBackoffMs}")
    String reconnectBackoffMs;

    @Value("${spring.kafka.retryBackoffMs}")
    String retryBackoffMs;

    @Value("${spring.kafka.autoOffsetReset}")
    String autoOffsetReset;

    @Value("${spring.kafka.avro.specificAvroReader}")
    String specificAvroReader;
}
