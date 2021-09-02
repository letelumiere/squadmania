package com.likeurator.squadmania.domain.repository;

import com.likeurator.squadmania.domain.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
