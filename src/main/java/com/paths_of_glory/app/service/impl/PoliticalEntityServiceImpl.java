package com.paths_of_glory.app.service.impl;

import com.paths_of_glory.app.domain.model.PoliticalEntity;
import com.paths_of_glory.app.dto.*;
import com.paths_of_glory.app.domain.repository.PoliticalEntityRepository;
import com.paths_of_glory.app.service.PoliticalEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PoliticalEntityServiceImpl implements PoliticalEntityService {

    private final PoliticalEntityRepository repository;

    @Override
    public PoliticalEntityResponse create(PoliticalEntityCreateRequest request) {
        PoliticalEntity entity = new PoliticalEntity();
        entity.setName(request.name());
        entity.setPoliticalEntityType(request.politicalEntityType());
        entity.setStartDate(request.startDate());
        entity.setEndDate(request.endDate());

        PoliticalEntity saved = repository.save(entity);
        return mapToResponse(saved);
    }

    @Override
    public PoliticalEntityResponse update(PoliticalEntityUpdateRequest request) {
        PoliticalEntity entity = repository.findById(request.id())
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        entity.setName(request.name());
        entity.setPoliticalEntityType(request.politicalEntityType());
        entity.setStartDate(request.startDate());
        entity.setEndDate(request.endDate());

        PoliticalEntity saved = repository.save(entity);
        return mapToResponse(saved);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PoliticalEntityResponse getById(Long id) {
        PoliticalEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        return mapToResponse(entity);
    }

    @Override
    public List<PoliticalEntityResponse> getAll() {
        return repository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private PoliticalEntityResponse mapToResponse(PoliticalEntity entity) {
        return new PoliticalEntityResponse(
                entity.getId(),
                entity.getName(),
                entity.getPoliticalEntityType(),
                entity.getStartDate(),
                entity.getEndDate()
        );
    }
}
