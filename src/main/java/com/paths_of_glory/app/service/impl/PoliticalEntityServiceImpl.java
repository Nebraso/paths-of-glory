package com.paths_of_glory.app.service.impl;

import com.paths_of_glory.app.domain.exception.EntityNotFoundException;
import com.paths_of_glory.app.domain.model.PoliticalEntity;
import com.paths_of_glory.app.dto.*;
import com.paths_of_glory.app.domain.repository.PoliticalEntityRepository;
import com.paths_of_glory.app.mapper.PoliticalEntityMapper;
import com.paths_of_glory.app.service.PoliticalEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@RequiredArgsConstructor
public class PoliticalEntityServiceImpl implements PoliticalEntityService {

    private final PoliticalEntityRepository repository;

    public PoliticalEntityServiceImpl(PoliticalEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public PoliticalEntityResponse create(PoliticalEntityCreateRequest request) {
        PoliticalEntity entity = PoliticalEntityMapper.toEntity(request);
        PoliticalEntity saved = repository.save(entity);
        return PoliticalEntityMapper.toResponse(saved);
    }

    @Override
    public PoliticalEntityResponse update(PoliticalEntityUpdateRequest request) {
        PoliticalEntity entity = repository.findById(request.getId())
                .orElseThrow(() -> new EntityNotFoundException(request.getId()));
        PoliticalEntityMapper.updateEntityFromRequest(entity, request);
        PoliticalEntity saved = repository.save(entity);
        return PoliticalEntityMapper.toResponse(saved);

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PoliticalEntityResponse getById(Long id) {
        PoliticalEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        return PoliticalEntityMapper.toResponse(entity);
    }

    @Override
    public List<PoliticalEntityResponse> getAll() {
        return repository.findAll().stream()
                .map(PoliticalEntityMapper::toResponse)
                .collect(Collectors.toList());
    }


}
