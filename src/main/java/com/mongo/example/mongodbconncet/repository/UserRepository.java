package com.mongo.example.mongodbconncet.repository;

import com.mongo.example.mongodbconncet.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
