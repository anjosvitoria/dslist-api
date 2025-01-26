package com.anjosdev.dsListApi.controllers;

import com.anjosdev.dsListApi.dto.GameMinDTO;
import com.anjosdev.dsListApi.entities.Game;
import com.anjosdev.dsListApi.repositories.GameRepository;
import com.anjosdev.dsListApi.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
