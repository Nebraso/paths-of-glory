package com.paths_of_glory.app.domain.repository;

import com.paths_of_glory.app.domain.model.War;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarRepository extends JpaRepository<War, Long> {
    Optional<War> findByName(String name);
}
