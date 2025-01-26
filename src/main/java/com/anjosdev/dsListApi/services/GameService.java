package com.anjosdev.dsListApi.services;

import com.anjosdev.dsListApi.dto.GameDTO;
import com.anjosdev.dsListApi.dto.GameMinDTO;
import com.anjosdev.dsListApi.entities.Game;
import com.anjosdev.dsListApi.projections.GameMinProjection;
import com.anjosdev.dsListApi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }
    // todo: tratar a exceção de um ID que não existe

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }

}
