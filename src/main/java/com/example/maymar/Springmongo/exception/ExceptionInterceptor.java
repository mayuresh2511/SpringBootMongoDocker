package com.example.maymar.Springmongo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

  @ExceptionHandler(EmailTakenCustomException.class)
  public ResponseEntity<Object> handleCustomEmailException(EmailTakenCustomException emailTakenCustomException){
    return new ResponseEntity<>(emailTakenCustomException, HttpStatus.BAD_REQUEST);
  }
}
