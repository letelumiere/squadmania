package com.likeurator.squadmania.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface domainRepository extends MongoRepository<String, String>{
    public void login();
    public void logout();
}
