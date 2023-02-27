package com.example.maymar.Springmongo.service;

import com.example.maymar.Springmongo.dto.UserSkillDTO;
import com.example.maymar.Springmongo.entity.Address;
import com.example.maymar.Springmongo.entity.Users;
import com.example.maymar.Springmongo.exception.EmailTakenCustomException;
import com.example.maymar.Springmongo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  private UsersRepository usersRepository;

  @Autowired
  private MongoTemplate mongoTemplate;

  public Users getUser(String name){
    return usersRepository.findByFirstName(name);
  }

  public UserSkillDTO getUsersSkills(String name){
    Users user = usersRepository.findByFirstName(name);
    UserSkillDTO dtoObj = new UserSkillDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getSkills());
    return dtoObj;
  }


  public String updateUserSalary(String name, Integer salary) {

    Query query = new Query();
    query.addCriteria(Criteria.where("firstName").is(name));

    Update update = new Update();
    update.set("salary", salary);

    mongoTemplate.findAndModify(query, update, Users.class);

    return "Updated user salary";
  }

  public String updateUserAddress(String name, Address address) {

    Query query = new Query();
    query.addCriteria(Criteria.where("firstName").is(name));

    Update update = new Update();
    update.set("address", address);

    mongoTemplate.findAndModify(query, update, Users.class);

    return "Updated user address";
  }

  public Users addUser(Users user) throws Exception {

    Query query = new Query();
    query.addCriteria(Criteria.where("email").is(user.getEmail()));

    Boolean userWithSameEmail = mongoTemplate.exists(query, Users.class);

    if(userWithSameEmail == true){
      throw new EmailTakenCustomException("Email already taken", "This email is already registered", "Try different email");
    }else{
      return usersRepository.save(user);
    }
  }
}
