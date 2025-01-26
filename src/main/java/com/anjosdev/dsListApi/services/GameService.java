package com.anjosdev.dsListApi.services;

import com.anjosdev.dsListApi.dto.GameMinDTO;
import com.anjosdev.dsListApi.entities.Game;
import com.anjosdev.dsListApi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
