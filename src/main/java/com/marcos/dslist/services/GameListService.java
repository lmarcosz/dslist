package com.marcos.dslist.services;

import com.marcos.dslist.dto.GameDTO;
import com.marcos.dslist.dto.GameListDTO;
import com.marcos.dslist.dto.GameMinDTO;
import com.marcos.dslist.entities.Game;
import com.marcos.dslist.entities.GameList;
import com.marcos.dslist.repositories.GameListRepository;
import com.marcos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
