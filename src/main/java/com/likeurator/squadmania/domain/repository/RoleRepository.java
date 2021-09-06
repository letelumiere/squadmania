package com.likeurator.squadmania.domain.repository;

import com.likeurator.squadmania.domain.model.Role;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    @Query("{'name' : ?0}") Role findRolebyName(String name);
}
