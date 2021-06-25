package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.List;
import java.util.Optional;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comment;
import com.likeurator.squadmania.gameapps.fifaon4.model.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/*
    추후 출력값을 ResponseEntity로 맞출 필요 있음
    맵핑 URI 값은 아직 정해지지 않음
*/


@RestController
@RequestMapping(value = "/fifaonline4")
@AllArgsConstructor
public class Fifaon4Controller {

    @Autowired
    private Fifaon4Service fifaon4Service;

    //public void createPlayer(){}
    //public void updatePlayer(){}
    //public void deletePlayer(){}

    @GetMapping("/api/player")
    public ResponseEntity<List<Player>> findAllPlayer(){
        return ResponseEntity.ok(fifaon4Service.findAllPlayer());
    }

    @GetMapping("/api/player/page/{pageNum}")
    public ResponseEntity<Page<Player>> findAllPlayerWithPageable(@PathVariable int pageNum){
        return ResponseEntity.ok(fifaon4Service.findAllPlayerWithPageable(pageNum));
    }
    
    @GetMapping("/api/player/{name}")
    public ResponseEntity<List<Player>> findAllPlayerByName(@PathVariable String name){
        return ResponseEntity.ok(fifaon4Service.findAllPlayerByName(name));
    }
    @GetMapping("/api/player/id/{spid}")
    public ResponseEntity<Player> findOnePlayerBySpid(@PathVariable int spid){
        return ResponseEntity.ok(fifaon4Service.findOnePlayerBySpid(spid));
    }

    @GetMapping("/api/player/id/{spid}/comment")
    public ResponseEntity<List<Comment>> findWithAggComment(@PathVariable int spid){
        return ResponseEntity.ok(fifaon4Service.findWithAggCommentBySpid(spid));
    }

    @GetMapping("/api/player/{spid}/comment")
    public ResponseEntity<List<Comment>> findAllCommentBySpid(@PathVariable int spid){
        return ResponseEntity.ok(fifaon4Service.findAllCommentBySpid(spid));
    }

    @PostMapping("/api/player/{spid}/comment")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment){
        fifaon4Service.createComment(comment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @PutMapping("/api/player/comment/{comment_id}")
    public ResponseEntity findAndUpdateComment(@PathVariable String comment_id, @RequestBody Comment comment){
        fifaon4Service.findAndUpdateComment(comment, comment_id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/player/{spid}/comment/{comment_id}")
    public ResponseEntity deleteComment(@PathVariable int spid, @PathVariable String comment_id){
        fifaon4Service.deleteComment(comment_id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/api/player/comment/{_id}")
    public ResponseEntity<Optional<Comment>> findCommentById(@PathVariable String _id){
        return ResponseEntity.ok(fifaon4Service.findOneCommentById(_id));
    }
}