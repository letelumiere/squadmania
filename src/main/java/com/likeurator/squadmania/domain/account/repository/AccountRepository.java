package com.likeurator.squadmania.domain.account.repository;

import com.likeurator.squadmania.domain.account.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<User, String>{
    User blah();
}
