package com.gizmo.reactor.infrastructure.storage.entity;


import lombok.Data;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Data
@Table(name = "reactor_log")
public class ReactorLogEntity {
    @Id
    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "user", nullable = false)
    private String user;
    @Column(name = "message", nullable = false)
    private String message;
}
