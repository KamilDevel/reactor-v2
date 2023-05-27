package com.gizmo.reactor.application.http.config;

import com.gizmo.reactor.message.ReactorLog;
import com.gizmo.reactor.message.SystemCommand;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
@RequiredArgsConstructor
public class KafkaProducerConfig {
    private final String SCHEMA_REGISTRY_URL_PROP = "schema.registry.url";
    private final KafkaProperties kafkaProperties;

    @Bean
    public <T> KafkaTemplate<String, T> kafkaTemplate(final ProducerFactory<String, T> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }

    @Bean
    public ProducerFactory producerFactoryCommand() {
        final Map<String, Object> producerConfig = getProducerConfig();
        return new DefaultKafkaProducerFactory<>(producerConfig);
    }

    private Map<String, Object> getProducerConfig() {
        final Map<String, Object> properties = new HashMap<>();

        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        properties.put(ProducerConfig.RETRIES_CONFIG, kafkaProperties.getRetries());
        properties.put(ProducerConfig.RECONNECT_BACKOFF_MS_CONFIG, kafkaProperties.getReconnectBackoffMs());
        properties.put(ProducerConfig.RETRY_BACKOFF_MS_CONFIG, kafkaProperties.getRetryBackoffMs());
        properties.put(SCHEMA_REGISTRY_URL_PROP, kafkaProperties.getRegistryUrl());

        return properties;
    }
}