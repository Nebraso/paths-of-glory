package com.paths_of_glory.app.domain.model;

import java.util.Date;
import org.springframework.lang.Nullable;


public class PoliticalEntityAllianceParticipation {
    private Long id;
    private PoliticalEntity politicalEntity;
    @Nullable
    private Alliance alliance;
    private War war;
    private Date joinDate;
    private Date leaveDate;
    private boolean switchedSide;
}
