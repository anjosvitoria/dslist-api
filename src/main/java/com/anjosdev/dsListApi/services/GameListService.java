package com.anjosdev.dsListApi.services;

import com.anjosdev.dsListApi.dto.GameListDTO;
import com.anjosdev.dsListApi.entities.GameList;
import com.anjosdev.dsListApi.repositories.GameListRepository;
import com.anjosdev.dsListApi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }



}
