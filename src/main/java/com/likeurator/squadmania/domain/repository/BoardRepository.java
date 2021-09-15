package com.likeurator.squadmania.domain.repository;

import java.util.List;

import com.likeurator.squadmania.domain.model.Board;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends MongoRepository<Board, String> {
    @Query("{'title': ?0}") List<Board> findByTitle(String title);
    @Query("{'nickname': ?0}") List<Board> findByNickname(String nickname);
    @Query("{'board_no': ?0}") Board findOneContents(int board_no);
    @Query("{'_id': ?0}") Board findOneContents(String _id);
}
