package com.joana.socialmediaposts.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joana.socialmediaposts.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}