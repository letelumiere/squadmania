package com.likeurator.squadmania.game_app.fifaon4;

import java.util.ArrayList;
import java.util.List;

import com.likeurator.squadmania.game_app.fifaon4.model.Player;
import com.likeurator.squadmania.game_app.fifaon4.model.PlayerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class Fifaon4Service{
    @Autowired  
    private Fifaon4Repository fifaon4repository;

    //player에서 
    public List<PlayerDTO> findAll(){
        List<Player> playerDB = fifaon4repository.findAll();
        List<PlayerDTO> playerDtoList = new ArrayList<PlayerDTO>();

        for(Player player : playerDB){
            PlayerDTO playerDto = new PlayerDTO();
            playerDtoList.add(playerDto.documentToDTO(player));
        }

        return playerDtoList;
    }

    public List<PlayerDTO> findAllWithPageable(){
        PageRequest pageable = PageRequest.of(0, 10);
        Page<Player> playerDB = fifaon4repository.findAll(pageable);
        List<PlayerDTO> playerDtoList = new ArrayList<PlayerDTO>();

        for(Player player : playerDB){
            PlayerDTO playerDto = new PlayerDTO();
            playerDtoList.add(playerDto.documentToDTO(player));
        }

        return playerDtoList; 
    }

    public List<PlayerDTO> findByAllNames(String name){
        List<PlayerDTO> playerDtoList = fifaon4repository.findByAllNames(name);
        
        return playerDtoList;
    }    

    public void deleteByOne(Player _id){
    //    fifaon4repository.deleteById(_id);
    }
}