package com.crio.coderhack.repository;
/*
 * @author adityagupta
 * @date 18/03/24
 */

import com.crio.coderhack.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
