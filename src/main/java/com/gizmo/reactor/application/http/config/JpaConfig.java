package com.gizmo.reactor.application.http.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.gizmo.reactor.infrastructure")
@EntityScan("com.gizmo.reactor.infrastructure.*")
public class JpaConfig {
}
