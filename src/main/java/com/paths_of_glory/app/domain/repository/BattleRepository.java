package com.paths_of_glory.app.domain.repository;

import com.paths_of_glory.app.domain.model.Battle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleRepository extends JpaRepository<Battle, Long> {
}
