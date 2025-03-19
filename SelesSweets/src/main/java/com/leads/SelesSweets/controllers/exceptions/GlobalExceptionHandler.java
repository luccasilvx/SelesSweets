package com.leads.SelesSweets.controllers.exceptions;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Hidden // swagger ignora esta classe
@RestControllerAdvice
@Slf4j(topic = "GLOBAL_EXCEPTION_HANDLER") //anotacoes da classe no console
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class) //422
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class) //404
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource ID not found. ", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class) //500
    public ResponseEntity<String>handleUnexpectedException(Throwable unexpectedException){
        var message = "Unexpected Server Error, see the logs.";
        logger.error(message,unexpectedException);
        return new ResponseEntity<>(message,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
