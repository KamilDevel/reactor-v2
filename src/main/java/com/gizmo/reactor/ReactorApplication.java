package com.gizmo.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gizmo")
//@EnableFeignClients(basePackages = {"com.gizmo.reactor.infrastructure.http.repository"})
public class ReactorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactorApplication.class, args);
    }
}