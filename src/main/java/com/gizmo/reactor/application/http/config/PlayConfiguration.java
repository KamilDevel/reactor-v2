package com.gizmo.reactor.application.http.config;

import com.gizmo.reactor.play.GoForMoney;
import com.gizmo.reactor.play.GoForPizza;
import com.gizmo.reactor.play.Vig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayConfiguration {
    @Bean
    public GoForMoney getGoForMoney() {
        return new GoForMoney();
    }

    @Bean
    public GoForPizza getGoForPizza() {
        return new GoForPizza();
    }

    @Bean
    public Vig getVig() {
        return new Vig(new GoForMoney(), new GoForPizza());
    }
}