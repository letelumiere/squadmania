package com.likeurator.squadmania.gameapps.fifaon4.repository;

import java.util.List;

import com.likeurator.squadmania.gameapps.fifaon4.model.Comment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String>{
    @Query("{'spid': ?0}") List<Comment> findAllCommmentBySpid(int spid);
    @Query("{'_id': ?0}") Comment findOneCommentById(String _id);
}