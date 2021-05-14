package com.likeurator.squadmania.game_app.fifaon4;

import java.util.List;

import com.likeurator.squadmania.game_app.fifaon4.model.Player;
import com.likeurator.squadmania.game_app.fifaon4.model.PlayerDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface Fifaon4Repository extends MongoRepository<Player, Long>{
    
    @Query("{'name' : ?0}")
    public List<PlayerDTO> findByAllNames(String name);
}

