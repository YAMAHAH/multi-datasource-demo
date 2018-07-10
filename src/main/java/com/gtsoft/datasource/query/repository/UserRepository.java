package com.gtsoft.datasource.query.repository;

import com.gtsoft.datasource.query.entries.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByName(String name);
}
