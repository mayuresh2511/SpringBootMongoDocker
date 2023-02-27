package com.example.maymar.Springmongo.dto;

import java.util.List;

public class UserSkillDTO {

  private String id;
  private String firstName;
  private String lastName;
  private List<String> skills;

  public UserSkillDTO(String id, String firstName, String lastName, List<String> skills) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.skills = skills;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }
}
