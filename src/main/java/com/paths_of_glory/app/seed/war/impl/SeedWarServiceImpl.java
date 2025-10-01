package com.paths_of_glory.app.seed.war.impl;

import com.paths_of_glory.app.domain.model.War;
import com.paths_of_glory.app.domain.repository.WarRepository;
import com.paths_of_glory.app.seed.battle.SeedBattleService;
import com.paths_of_glory.app.seed.war.SeedWarService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SeedWarServiceImpl implements SeedWarService {
    private final WarRepository repository;

    public SeedWarServiceImpl(WarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seed() {
        if (repository.count() == 0) {
            War worldWarII = new War();
            worldWarII.setName("World War II");
            worldWarII.setStartDate(LocalDate.of(1939, 9, 1));
            worldWarII.setEndDate(LocalDate.of(1945, 9, 2));
            worldWarII.setGeneralLocation("The World");

            War sevenYearsWar = new War();
            sevenYearsWar.setName("Seven Years War");
            sevenYearsWar.setStartDate(LocalDate.of(1756, 1, 1));
            sevenYearsWar.setEndDate(LocalDate.of(1763, 1, 1));
            sevenYearsWar.setGeneralLocation("The World");


            repository.save(worldWarII);
            repository.save(sevenYearsWar);
        }
    }
}
