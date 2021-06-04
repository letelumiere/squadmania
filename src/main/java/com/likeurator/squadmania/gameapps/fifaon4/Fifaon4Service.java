package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.ArrayList;
import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comments;
import com.likeurator.squadmania.gameapps.fifaon4.model.CommentsDTO;
import com.likeurator.squadmania.gameapps.fifaon4.model.PlayerDatabase;
import com.likeurator.squadmania.gameapps.fifaon4.model.PlayerDatabaseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class Fifaon4Service{
    @Autowired  
    private Fifaon4PlayerDatabaseRepository fifaon4repository;

    @Autowired
    private Fifaon4CommentRepository commentRepository;

    //player에서 
    public List<PlayerDatabaseDTO> findAll(){
        List<PlayerDatabase> playerDB = fifaon4repository.findAll();
        List<PlayerDatabaseDTO> playerDtoList = new ArrayList<PlayerDatabaseDTO>();

        for(PlayerDatabase player : playerDB){
            PlayerDatabaseDTO playerDto = new PlayerDatabaseDTO();
            playerDtoList.add(playerDto.documentToDTO(player));
        }

        return playerDtoList;
    }

    public List<PlayerDatabaseDTO> findAllWithPageable(){
        PageRequest pageable = PageRequest.of(0, 10);
        Page<PlayerDatabase> playerDB = fifaon4repository.findAll(pageable);
        List<PlayerDatabaseDTO> playerDtoList = new ArrayList<PlayerDatabaseDTO>();

        for(PlayerDatabase player : playerDB){
            PlayerDatabaseDTO playerDto = new PlayerDatabaseDTO();
            playerDtoList.add(playerDto.documentToDTO(player));
        }

        return playerDtoList; 
    }

    public List<PlayerDatabaseDTO> findByAllNames(String name){
        List<PlayerDatabaseDTO> playerDtoList = fifaon4repository.findByAllNames(name);
        
        return playerDtoList;
    }

    public Comments insertComment(CommentsDTO commentsDto){
        Comments comments = commentsDto.toDocumentBuild();
        return commentRepository.save(comments);
    }

    public List<CommentsDTO> readCommentsByPlayerid(String playerid){
        List<CommentsDTO> commentsDtoList = commentRepository.readCommentsByPlayerid(playerid);
        return commentsDtoList;
    }

}