package com.anjosdev.dsListApi.repositories;

import com.anjosdev.dsListApi.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
