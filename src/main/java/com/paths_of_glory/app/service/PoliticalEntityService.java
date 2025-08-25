package com.paths_of_glory.app.service;

import com.paths_of_glory.app.dto.PoliticalEntityCreateRequest;
import com.paths_of_glory.app.dto.PoliticalEntityResponse;
import com.paths_of_glory.app.dto.PoliticalEntityUpdateRequest;
import java.util.List;

public interface PoliticalEntityService {
    PoliticalEntityResponse create(PoliticalEntityCreateRequest request);
    PoliticalEntityResponse update(PoliticalEntityUpdateRequest request);
    void delete(Long id);
    PoliticalEntityResponse getById(Long id);
    List<PoliticalEntityResponse> getAll();
}