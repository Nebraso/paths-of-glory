package com.paths_of_glory.app.seed.battle.impl;

import com.paths_of_glory.app.domain.model.Battle;
import com.paths_of_glory.app.domain.model.War;
import com.paths_of_glory.app.domain.repository.BattleRepository;
import com.paths_of_glory.app.domain.repository.WarRepository;
import com.paths_of_glory.app.seed.battle.SeedBattleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

@Service
public class SeedBattleServiceImpl implements SeedBattleService {
    private final BattleRepository repository;
    private final WarRepository warRepository;

    public SeedBattleServiceImpl(BattleRepository repository, WarRepository warRepository) {
        this.repository = repository;
        this.warRepository = warRepository;
    }

    @Override
    public void seed() {
        if (repository.count() == 0) {
            // Map of battle names to war names
            Map<String, String> battleToWarMap = Map.of(
                "The Battle of Stalingrad", "World War II",
                "The Battle of Midway", "World War II"
                // Add more battles and their corresponding wars here
            );

            // Create and save Stalingrad battle
            createBattle(
                "The Battle of Stalingrad",
                LocalDate.of(1942, 8, 23),
                LocalDate.of(1943, 2, 2),
                "Stalingrad, Soviet Union",
                battleToWarMap.get("The Battle of Stalingrad")
            );

            // Create and save Midway battle
            createBattle(
                "The Battle of Midway",
                LocalDate.of(1942, 6, 4),
                LocalDate.of(1942, 6, 7),
                "Midway, Hawaii",
                battleToWarMap.get("The Battle of Midway")
            );
        }
    }

    private void createBattle(String name, LocalDate startDate, LocalDate endDate, String location, String warName) {
        // Find the war by name
        Optional<War> warOpt = warRepository.findByName(warName);
        
        if (warOpt.isPresent()) {
            Battle battle = new Battle();
            battle.setName(name);
            battle.setStartDate(startDate);
            battle.setEndDate(endDate);
            battle.setLocation(location);
            battle.setWar(warOpt.get());
            
            repository.save(battle);
        } else {
            System.err.println("Warning: Could not find war with name: " + warName + " for battle: " + name);
        }
    }
}
