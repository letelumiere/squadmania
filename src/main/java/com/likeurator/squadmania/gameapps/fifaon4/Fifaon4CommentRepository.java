package com.likeurator.squadmania.gameapps.fifaon4;

import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comments;
import com.likeurator.squadmania.gameapps.fifaon4.model.CommentsDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Fifaon4CommentRepository extends MongoRepository<Comments, Long>{

    @Query("{'playerid' : ?0}")
    public List<CommentsDTO> readCommentsByPlayerid(String playerid);
    
    /*
    @Query("{'nickname' : ?0} , {'playerid': ?0} , {'comment' : ?0}")
    public Comments insertComments(CommentsDTO commentsDto);
    */

    //@Query("{'_id': ?0}, {$set : {'comment' : ?0}}")
    //public void updateComments(ObjectId _id); 
    
    //public void deleteComments();
}
