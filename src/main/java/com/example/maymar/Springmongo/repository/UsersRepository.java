package com.example.maymar.Springmongo.repository;

import com.example.maymar.Springmongo.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {

  public Users findByFirstName(String firstName);
  public List<Users> findByLastName(String lastName);

}
