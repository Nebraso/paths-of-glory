package com.paths_of_glory.app.domain.model;

import com.paths_of_glory.app.shared.enums.PoliticalEntityType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "commander")
public class Commander {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private LocalDate birthDate;
    private LocalDate deathDate;

    public Commander() {}

    public Commander(Long id, String fullName,  LocalDate birthDate, LocalDate deathDate) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }
}
