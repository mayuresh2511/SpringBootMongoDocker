package com.example.maymar.Springmongo.exception;

public class EmailTakenCustomException extends RuntimeException{

  private String message;
  private String details;
  private String hint;

  public EmailTakenCustomException(String message, String details, String hint){
    this.message = message;
    this.details = details;
    this.hint = hint;
  }
}
