package com.example.maymar.Springmongo.entity;

public class Address {

  private String country;
  private String city;
  private Integer zipcode;

  public Address(String country, String city, Integer zipcode) {
    this.country = country;
    this.city = city;
    this.zipcode = zipcode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Integer getZipcode() {
    return zipcode;
  }

  public void setZipcode(Integer zipcode) {
    this.zipcode = zipcode;
  }
}
