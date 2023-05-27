package com.gizmo.reactor.play;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoForPizza implements GoFor {
    @Override
    public void go() {
        log.warn("------------------------------------------------------------");
        log.warn("LETS GO FOR PIZZA!!!!!!!!!!");
        log.warn("------------------------------------------------------------");
    }
}
