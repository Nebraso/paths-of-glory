package com.paths_of_glory.app.domain.model;

import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.Date;

public class War {
    private Long id;
    private String name;
    @Nullable
    private LocalDate  startDate;
    @Nullable
    private LocalDate  endDate;
    private String generalLocation;
}
