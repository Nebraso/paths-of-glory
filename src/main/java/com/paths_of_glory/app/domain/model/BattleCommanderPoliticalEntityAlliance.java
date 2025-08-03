package com.paths_of_glory.app.domain.model;

import org.springframework.lang.Nullable;
import java.time.LocalDate;

public class BattleCommanderPoliticalEntityAlliance {

    private Long id;
    private Battle battle;
    private Commander commander;
    private PoliticalEntityAllianceParticipation politicalEntityAllianceParticipation;
    private String role; // مثل: General, Colonel, Field Marshal...
    private LocalDate joinDate;

    @Nullable
    private LocalDate switchDate;
    @Nullable
    private Boolean switchedSide;
}
