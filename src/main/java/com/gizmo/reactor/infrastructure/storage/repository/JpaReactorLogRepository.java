package com.gizmo.reactor.infrastructure.storage.repository;

import com.gizmo.reactor.infrastructure.storage.entity.ReactorLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface JpaReactorLogRepository extends JpaRepository<ReactorLogEntity, UUID> {

}
