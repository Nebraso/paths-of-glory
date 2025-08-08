package com.paths_of_glory.app.domain.repository;
import com.paths_of_glory.app.domain.model.PoliticalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticalEntityRepository extends JpaRepository<PoliticalEntity, Long> {
}
