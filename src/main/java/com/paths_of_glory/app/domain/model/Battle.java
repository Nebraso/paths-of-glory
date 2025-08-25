package com.paths_of_glory.app.domain.model;
import org.springframework.lang.Nullable;

import java.time.LocalDate;


public class Battle {
    private Long id;
    private String name;
    @Nullable
    private LocalDate  startDate;
    @Nullable
    private LocalDate  endDate;
    private War war;
    private String location;
}
