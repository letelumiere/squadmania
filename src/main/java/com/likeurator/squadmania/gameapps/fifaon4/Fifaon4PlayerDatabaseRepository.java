package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.PlayerDatabase;
import com.likeurator.squadmania.gameapps.fifaon4.model.PlayerDatabaseDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface Fifaon4PlayerDatabaseRepository extends MongoRepository<PlayerDatabase, Long> {
    
    @Query("{'name' : ?0}")
    public List<PlayerDatabaseDTO> findByAllNames(String name);

    
}

