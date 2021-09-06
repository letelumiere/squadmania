package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.List;
import java.util.Optional;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comment;
import com.likeurator.squadmania.gameapps.fifaon4.model.Player;
import com.likeurator.squadmania.gameapps.fifaon4.repository.CommentRepository;
import com.likeurator.squadmania.gameapps.fifaon4.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class Fifaon4Service{
    @Autowired 
    private PlayerRepository playerRepository;
    
    @Autowired private CommentRepository commentRepository;

    public List<Player> findAllPlayer(){
        return playerRepository.findAll();
    }

    public Page<Player> findAllPlayerWithPageable(int pageNum){
        PageRequest pageable = PageRequest.of(pageNum, pageNum + 10);
        Page<Player> player = playerRepository.findAll(pageable);
        return player;
    }

    public Player findOnePlayerBySpid(int spid){
        return playerRepository.findOnePlayerBySpid(spid);
    }

    public List<Player> findAllPlayerByName(String name){
        return playerRepository.findAllPlayerByName(name);
    }


    public Optional<Comment> findOneCommentById(String id){
        return commentRepository.findById(id);
    }

    public List<Comment> findAllCommentBySpid(int spid){
        return commentRepository.findAllCommmentBySpid(spid);
    }

    public List<Comment> findWithAggCommentBySpid(int spid){
        return playerRepository.findWithAggCommentsBySpid(spid);
    }
    public void createComment(Comment comment){
        commentRepository.insert(comment);
    }

    public void findAndUpdateComment(Comment comment, String _id){
        Comment responseBody = commentRepository.findOneCommentById(_id);
        responseBody.setContents(comment.getContents());
        commentRepository.save(responseBody);
    }

    public void deleteComment(String _id){
        commentRepository.deleteById(_id);
    }

        /* 추후 크롤링 구현 용 */
    //public void insertPlayer(){}
    //public void findOneAndUpdatePlayer(){}
    //public void findOneAnddeletePlayer(){}
    //public void createPlayer(){}
    //public void findOnePlayer(){}

}
