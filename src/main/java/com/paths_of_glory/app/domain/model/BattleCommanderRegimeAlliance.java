package com.paths_of_glory.app.domain.model;

import java.time.LocalDate;

public class BattleCommanderRegimeAlliance {

    private Long id;
    private Battle battle;
    private Commander commander;
    private RegimeAllianceParticipation regimeAllianceParticipation;
    private String role; // مثل: General, Colonel, Field Marshal...
    private LocalDate joinDate;
    private LocalDate switchDate; // ممكن تكون null
    private Boolean switchedSide; // ممكن تكون null
}