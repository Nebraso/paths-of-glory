package com.paths_of_glory.app.seed;

import com.paths_of_glory.app.seed.alliance.SeedAllianceService;
import com.paths_of_glory.app.seed.battle.SeedBattleService;
import com.paths_of_glory.app.seed.commander.SeedCommanderService;
import com.paths_of_glory.app.seed.political_entity.SeedPoliticalEntityService;
import com.paths_of_glory.app.seed.war.SeedWarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDataRunner implements CommandLineRunner {
    private final SeedPoliticalEntityService seedPoliticalEntityService;
    private final SeedAllianceService seedAllianceService;
    private final SeedWarService seedWarService;
    private final SeedBattleService seedBattleService;
    private final SeedCommanderService seedCommanderService;

    public SeedDataRunner
            (SeedPoliticalEntityService seedPoliticalEntityService,SeedAllianceService seedAllianceService,
             SeedWarService seedWarService,SeedBattleService seedBattleService,
             SeedCommanderService seedCommanderService) {
        this.seedPoliticalEntityService = seedPoliticalEntityService;
        this.seedAllianceService = seedAllianceService;
        this.seedWarService = seedWarService;
        this.seedBattleService = seedBattleService;
        this.seedCommanderService = seedCommanderService;

    }

    @Override
    public void run(String... args) {
        seedPoliticalEntityService.seed();
        seedAllianceService.seed();
        seedWarService.seed();
        seedBattleService.seed();
        seedCommanderService.seed();

    }
}
