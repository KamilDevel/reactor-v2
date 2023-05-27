package com.gizmo.reactor.infrastructure.service;

import com.gizmo.reactor.infrastructure.storage.entity.ReactorLogEntity;
import com.gizmo.reactor.infrastructure.storage.repository.JpaReactorLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReactorLogService {
    private final JpaReactorLogRepository reactorLogRepository;

    public Optional<ReactorLogEntity> getReactorLog(UUID id) {
        return reactorLogRepository.findById(id);
    }
}
