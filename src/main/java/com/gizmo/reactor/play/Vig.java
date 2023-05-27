package com.gizmo.reactor.play;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class Vig {
    private final GoForMoney goForMoney;
    private final GoForPizza goForPizza;
}
