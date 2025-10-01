package com.paths_of_glory.app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.Nullable;
import java.time.LocalDate;

@Entity
@Table(name = "alliance")
public class Alliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @Nullable
    private LocalDate startDate;
    
    @Nullable
    private LocalDate endDate;
    

    public Alliance() {}
    
    public Alliance(Long id, String name, @Nullable LocalDate startDate, @Nullable LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Nullable
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public void setStartDate(@Nullable LocalDate startDate) {
        this.startDate = startDate;
    }
    
    @Nullable
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public void setEndDate(@Nullable LocalDate endDate) {
        this.endDate = endDate;
    }
}
