package com.paths_of_glory.app.seed.commander.Impl;

import com.paths_of_glory.app.domain.model.Commander;
import com.paths_of_glory.app.domain.repository.CommanderRepository;
import com.paths_of_glory.app.seed.commander.SeedCommanderService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SeedCommanderServiceImpl implements SeedCommanderService {
    private final CommanderRepository repository;

    public SeedCommanderServiceImpl(CommanderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seed() {
        if (repository.count() == 0) {
            Commander charles = new Commander();
            charles.setFullName("Charles Martel");
            charles.setBirthDate(LocalDate.of(714, 1, 1));
            charles.setDeathDate(LocalDate.of(775, 1, 1));

            Commander richard = new Commander();
            richard.setFullName("Richard the Lionheart");
            richard.setBirthDate(LocalDate.of(1157, 9, 8));
            richard.setDeathDate(LocalDate.of(1199, 4, 6));

            Commander napoleon = new Commander();
            napoleon.setFullName("Napoleon Bonaparte");
            napoleon.setBirthDate(LocalDate.of(1769, 8, 15));
            napoleon.setDeathDate(LocalDate.of(1821, 5, 5));


            repository.save(charles);
            repository.save(richard);
            repository.save(napoleon);
        }
    }
}
