package com.paths_of_glory.app.domain.model;

import java.util.Date;
import org.springframework.lang.Nullable;
import java.time.LocalDate;

public class PoliticalEntityAllianceParticipation {
    private Long id;
    private PoliticalEntity politicalEntity;
    @Nullable
    private Alliance alliance;
    private War war;
    private LocalDate  joinDate;
    private LocalDate  leaveDate;
    private boolean switchedSide;
}
