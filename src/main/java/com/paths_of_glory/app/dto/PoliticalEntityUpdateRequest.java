package com.paths_of_glory.app.dto;

import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import java.time.LocalDate;

public class PoliticalEntityUpdateRequest extends PoliticalEntityCreateRequest {
    private Long id;
    private String name;
    private PoliticalEntityType politicalEntityType;
    private LocalDate startDate;
    private LocalDate endDate;

    public PoliticalEntityUpdateRequest() {}

    public PoliticalEntityUpdateRequest(Long id, String name, PoliticalEntityType politicalEntityType, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.politicalEntityType = politicalEntityType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoliticalEntityType getPoliticalEntityType() {
        return politicalEntityType;
    }

    public void setPoliticalEntityType(PoliticalEntityType politicalEntityType) {
        this.politicalEntityType = politicalEntityType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}


