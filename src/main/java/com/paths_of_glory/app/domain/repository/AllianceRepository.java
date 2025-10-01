package com.paths_of_glory.app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paths_of_glory.app.domain.model.Alliance;
import org.springframework.stereotype.Repository;


@Repository
public interface AllianceRepository extends JpaRepository<Alliance, Long>{
}
