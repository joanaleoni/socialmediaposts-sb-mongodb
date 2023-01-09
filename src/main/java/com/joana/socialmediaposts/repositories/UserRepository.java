package com.joana.socialmediaposts.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joana.socialmediaposts.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}