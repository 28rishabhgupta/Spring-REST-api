package com.codewithrishabh.blog.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.codewithrishabh.blog.payloads.Apiresponse;

@RestControllerAdvice
public class GlobalExceptionhandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Apiresponse> responseNotFoundExceptionHandler
	(ResourceNotFoundException ex){
		String message = ex.getMessage();
		Apiresponse apiResponse = new Apiresponse(message, false);
		return new ResponseEntity<Apiresponse>(apiResponse, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity <Map<String, String>> handleMethodNotValidException(MethodArgumentNotValidException ex){
		Map<String , String> response = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error) ->{
			String fieldName = ((FieldError)error).getField();
			String message = error.getDefaultMessage();
			response.put(fieldName,message);
		});
		return new ResponseEntity<Map<String, String>>(response, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
