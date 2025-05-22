package com.marcos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
