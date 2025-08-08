package com.paths_of_glory.app.dto;
import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import java.time.LocalDate;

public record PoliticalEntityCreateRequest(
        String name,
        PoliticalEntityType politicalEntityType,
        LocalDate startDate,
        LocalDate endDate
) {}
