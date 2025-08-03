package com.paths_of_glory.app.domain.model;

import java.util.Date;

public class PoliticalEntityAllianceParticipation {
    private Long id;
    private PoliticalEntity politicalEntity;
    private Alliance alliance; // ممكن تكون null
    private War war;
    private Date joinDate;
    private Date leaveDate;
    private boolean switchedSide;
}