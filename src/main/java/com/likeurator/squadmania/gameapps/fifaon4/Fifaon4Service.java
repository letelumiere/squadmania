package com.likeurator.squadmania.gameapps.fifaon4;

import java.lang.System.Logger;
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

@AllArgsConstructor
@Service
public class Fifaon4Service{

    @Autowired  
    private PlayerRepository playerRepository;

    @Autowired
    private CommentRepository commentRepository;

    //public void createPlayer(){}
    //public void findOnePlayer(){}

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

    /* 추후 크롤링 구현 용 */
    //public void insertPlayer(){}
    //public void findOneAndUpdatePlayer(){}
    //public void findOneAnddeletePlayer(){}

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
}

/*

    public void updateExpense(Expense expense){
        Expense savedExpense = expenseRepository.findById(expense.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Expense by ID %s", expense.getId())));
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(expense);
    }
*/

/*    
    public List<PlayerDatabaseDTO> findAllWithPageable(){
        PageRequest pageable = PageRequest.of(0, 10);
        Page<PlayerDatabase> playerDB = playerDatabaseRepository.findAll(pageable);
        List<PlayerDatabaseDTO> playerDtoList = new ArrayList<PlayerDatabaseDTO>();

        for(PlayerDatabase player : playerDB){
            PlayerDatabaseDTO playerDto = new PlayerDatabaseDTO();
            playerDtoList.add(playerDto.documentToDTO(player));
        }

        return playerDtoList; 
    }
    public PlayerDatabaseDTO findOneByPlayerid(String playerid) {
        return playerDatabaseRepository.findByPlayerid(playerid);
    }

    public List<PlayerDatabaseDTO> findAllByNames(String name) {
        return playerDatabaseRepository.findByNames(name);
    }
    
    public List<CommentsDTO> findAllCommentsByPlayerid(String playerid){
        return commentsRepository.findByPlayerid(playerid);
    }
    
    public Comments insertComment(CommentsDTO commentsDto){
        return commentsRepository.save(commentsDto.toDocumentBuild());
    }
    //player에서 
    /*
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
    public Comments insertComment(CommentsDTO commentsDto){
        Comments comments = commentsDto.toDocumentBuild();
        System.out.println(comments);
        return commentRepository.save(comments);
    }
    
*/
