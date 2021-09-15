package com.likeurator.squadmania.domain.repository;

import java.util.List;

import com.likeurator.squadmania.domain.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    @Query("{'username': ?0}") User findUserByUsername(String username);
    @Query("{'email': ?0}") User findUserByEmail(String email);
    @Query("{'nickname': ?0}") List<User> findAllUsersByNickName(String nickname);
    @Query("{'_id': ?0}") User findOneUserById(String id);
}