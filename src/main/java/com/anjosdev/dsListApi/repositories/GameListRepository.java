package com.anjosdev.dsListApi.repositories;

import com.anjosdev.dsListApi.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
