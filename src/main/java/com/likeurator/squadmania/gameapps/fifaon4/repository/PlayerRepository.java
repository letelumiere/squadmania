package com.likeurator.squadmania.gameapps.fifaon4.repository;

import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comment;
import com.likeurator.squadmania.gameapps.fifaon4.model.Player;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

    @Query("{'information.name': ?0}") List<Player> findAllPlayerByName(String name);
    @Query("{'spid': ?0}") Player findOnePlayerBySpid(int spid);
    
    @Aggregation({"{$match: {spid : ?0}}", 
                    "{$graphLookup: {from: 'comments_test',startWith: '$spid',connectFromField: 'spid',connectToField: 'spid',as: 'comments',maxDepth: 2}}",
                    "{$unwind: {path: '$comments', includeArrayIndex: 'comments.commentSeq', preserveNullAndEmptyArrays: false}}",
                    "{$project : {_id : 1, users_nickname : '$comments.users_nickname', contents : '$comments.contents',"
                        +"report_bad : '$comments.report_bad',"
                        +"like : '$comments.like', created_at: '$comments.created_at', modified_at: '$comments.modified_at',"
                        +"spid: '$comments.spid', commentSeq: '$comments.commentseq'}}"}) 
    public List<Comment> findWithAggCommentsBySpid(int spid);

    

}



