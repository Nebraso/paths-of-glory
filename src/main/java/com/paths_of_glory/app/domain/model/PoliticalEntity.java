package com.paths_of_glory.app.domain.model;
import jakarta.persistence.*;
import lombok.*;
import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import java.time.LocalDate;


@Entity
@Data
public class PoliticalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PoliticalEntityType politicalEntityType;
    private LocalDate  startDate;
    private LocalDate  endDate;
}

