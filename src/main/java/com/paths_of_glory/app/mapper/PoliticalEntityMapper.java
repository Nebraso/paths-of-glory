package com.paths_of_glory.app.mapper;

import com.paths_of_glory.app.domain.model.PoliticalEntity;
import com.paths_of_glory.app.dto.PoliticalEntityCreateRequest;
import com.paths_of_glory.app.dto.PoliticalEntityResponse;
import com.paths_of_glory.app.dto.PoliticalEntityUpdateRequest;

public  final  class PoliticalEntityMapper {

    public static void updateEntityFromRequest(PoliticalEntity entity, PoliticalEntityUpdateRequest request) {
        entity.setName(request.getName());
        entity.setPoliticalEntityType(request.getPoliticalEntityType());
        entity.setStartDate(request.getStartDate());
        entity.setEndDate(request.getEndDate());
    }

    public static PoliticalEntity toEntity(PoliticalEntityCreateRequest request) {
        PoliticalEntity entity = new PoliticalEntity();
        entity.setName(request.getName());
        entity.setPoliticalEntityType(request.getPoliticalEntityType());
        entity.setStartDate(request.getStartDate());
        entity.setEndDate(request.getEndDate());
        return entity;
    }
    public static PoliticalEntityResponse toResponse(PoliticalEntity entity) {
        if (entity == null) {
            return null;
        }
        return new PoliticalEntityResponse(
                entity.getId(),
                entity.getName(),
                entity.getPoliticalEntityType(),
                entity.getStartDate(),
                entity.getEndDate()
        );
    }
}
