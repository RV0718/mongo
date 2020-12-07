package com.mongo.jpa.repository;

import com.mongo.jpa.domain.PhoneNumber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberDaoRepository extends MongoRepository<PhoneNumber, Long> {
}
