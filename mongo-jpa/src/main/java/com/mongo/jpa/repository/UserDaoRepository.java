package com.mongo.jpa.repository;

import com.mongo.jpa.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoRepository extends MongoRepository<User, Long> {

}
