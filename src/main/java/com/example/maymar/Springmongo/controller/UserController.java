package com.example.maymar.Springmongo.controller;

import com.example.maymar.Springmongo.dto.Salary;
import com.example.maymar.Springmongo.dto.UserSkillDTO;
import com.example.maymar.Springmongo.entity.Address;
import com.example.maymar.Springmongo.entity.Users;
import com.example.maymar.Springmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo/apiv2")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user/{name}")
  public Users getUser(@PathVariable("name") String name){
      Users user = userService.getUser(name);
      if(user == null){
        return new Users();
      }
      return userService.getUser(name);
  }

  @GetMapping("/user-skills/{name}")
  public UserSkillDTO getUsersSkills(@PathVariable String name){
    return userService.getUsersSkills(name);
  }

  @PutMapping("/user-update-salary/{name}")
  public String updateSalary(@PathVariable String name, @RequestBody Salary salary){
    return userService.updateUserSalary(name, salary.getSalary());
  }

  @PutMapping("/user-update-address/{name}")
  public String updateUserAddress(@PathVariable String name, @RequestBody Address address){
    System.out.println(address.getCity() + " " + address.getCountry());
    return userService.updateUserAddress(name, address);
  }

  @PostMapping("/user")
  public Users addUser(@RequestBody Users user) throws Exception {
    return userService.addUser(user);
  }

}
