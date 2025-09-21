package com.paths_of_glory.app.seed;

import com.paths_of_glory.app.seed.political_entity.SeedPoliticalEntityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDataRunner implements CommandLineRunner {

    private final SeedPoliticalEntityService seedPoliticalEntityService;

    public SeedDataRunner(SeedPoliticalEntityService seedPoliticalEntityService) {
        this.seedPoliticalEntityService = seedPoliticalEntityService;
    }

    @Override
    public void run(String... args) {
        seedPoliticalEntityService.seed();
    }
}
