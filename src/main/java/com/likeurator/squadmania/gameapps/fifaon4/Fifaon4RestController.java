package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comments;
import com.likeurator.squadmania.gameapps.fifaon4.model.CommentsDTO;
import com.likeurator.squadmania.gameapps.fifaon4.model.PlayerDatabaseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/fifaonline4")
@AllArgsConstructor
public class Fifaon4RestController {

    @Autowired
    private Fifaon4Service fifaonService;

    @RequestMapping(value = "/findAll")
    public List<PlayerDatabaseDTO> findAll(){
        return fifaonService.findAll();
    }

    @RequestMapping(value = "/findAllWtihPageble")
    public List<PlayerDatabaseDTO> findAllWithPageable(){
        return fifaonService.findAllWithPageable();
    }

    @RequestMapping(value = "/findAllByNames")
    public List<PlayerDatabaseDTO> findAllByNames(String name){
        name = "데이비드 시먼";
        return fifaonService.findByAllNames(name);
    }

    @RequestMapping(value = "/comment/read")
    public List<CommentsDTO> readComments(String playerid){
        playerid = "101005471";
        return fifaonService.readCommentsByPlayerid(playerid);
    }


    @RequestMapping(value = "/comment/create")
    public Comments WriteComments(String nickname, String playerid, String comment){
        // 임시 parameter        
        nickname = "심영";
        playerid = "101005471";
        comment = "사회주의 낙원을 말하는 것입니다 여러부운!";

        CommentsDTO commentsDto = new CommentsDTO();
        commentsDto.setPlayerid(playerid);
        commentsDto.setNickname(nickname);
        commentsDto.setComment(comment);

        return fifaonService.insertComment(commentsDto);
    }
}
