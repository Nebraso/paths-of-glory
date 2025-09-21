package com.paths_of_glory.app.seed.political_entity.impl;

import com.paths_of_glory.app.domain.model.PoliticalEntity;
import com.paths_of_glory.app.seed.political_entity.SeedPoliticalEntityService;
import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import com.paths_of_glory.app.domain.repository.PoliticalEntityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SeedPoliticalEntityServiceImpl implements SeedPoliticalEntityService {

    private final PoliticalEntityRepository repository;

    public SeedPoliticalEntityServiceImpl(PoliticalEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seed() {
        if (repository.count() == 0) {
            PoliticalEntity rome = new PoliticalEntity();
            rome.setName("Roman Empire");
            rome.setPoliticalEntityType(PoliticalEntityType.EMPIRE);
            rome.setStartDate(LocalDate.of(27, 1, 1));
            rome.setEndDate(LocalDate.of(476, 1, 1));

            PoliticalEntity han = new PoliticalEntity();
            han.setName("Han Dynasty");
            han.setPoliticalEntityType(PoliticalEntityType.EMPIRE);
            han.setStartDate(LocalDate.of(-206, 1, 1)); // 206 BC
            han.setEndDate(LocalDate.of(220, 1, 1));

            PoliticalEntity ottoman = new PoliticalEntity();
            ottoman.setName("Ottoman Empire");
            ottoman.setPoliticalEntityType(PoliticalEntityType.EMPIRE);
            ottoman.setStartDate(LocalDate.of(1299, 1, 1));
            ottoman.setEndDate(LocalDate.of(1922, 11, 1));


            repository.save(rome);
            repository.save(han);
            repository.save(ottoman);
        }
    }
}
