package com.paths_of_glory.app.domain.model;

import java.time.LocalDate;
import java.util.Date;

public class RegimeAllianceParticipation {
    private Long id;
    private Regime regime;
    private Alliance alliance; // ممكن تكون null
    private War war;
    private Date joinDate;
    private Date leaveDate;
    private boolean switchedSide;
}