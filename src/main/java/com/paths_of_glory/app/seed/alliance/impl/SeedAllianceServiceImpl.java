package com.paths_of_glory.app.seed.alliance.impl;

import com.paths_of_glory.app.domain.model.Alliance;
import com.paths_of_glory.app.domain.model.PoliticalEntity;
import com.paths_of_glory.app.domain.repository.AllianceRepository;
import com.paths_of_glory.app.domain.repository.PoliticalEntityRepository;
import com.paths_of_glory.app.seed.alliance.SeedAllianceService;
import com.paths_of_glory.app.seed.political_entity.SeedPoliticalEntityService;
import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SeedAllianceServiceImpl implements SeedAllianceService {

    private final AllianceRepository repository;

    public SeedAllianceServiceImpl(AllianceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seed() {
        if (repository.count() == 0) {
            Alliance axis = new Alliance();
            axis.setName("Axis");
            axis.setStartDate(LocalDate.of(1936, 1, 1));
            axis.setEndDate(LocalDate.of(1945, 9, 2));

            Alliance nato = new Alliance();
            nato.setName("NATO");
            nato.setStartDate(LocalDate.of(1949, 4, 4));
            nato.setEndDate(LocalDate.of(2024, 12, 31));

            Alliance warsaw = new Alliance();
            warsaw.setName("Warsaw Pact");
            warsaw.setStartDate(LocalDate.of(1955, 5, 1));
            warsaw.setEndDate(LocalDate.of(2024, 12, 31));

            Alliance OPEC = new Alliance();
            OPEC.setName("OPEC");
            OPEC.setStartDate(LocalDate.of(1960, 1, 1));
            OPEC.setEndDate(LocalDate.of(2024, 12, 31));



            repository.save(axis);
            repository.save(nato);
            repository.save(warsaw);
            repository.save(OPEC);
        }
    }
}
