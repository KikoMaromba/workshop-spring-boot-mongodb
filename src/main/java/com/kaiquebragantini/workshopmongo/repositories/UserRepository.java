package com.kaiquebragantini.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaiquebragantini.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
