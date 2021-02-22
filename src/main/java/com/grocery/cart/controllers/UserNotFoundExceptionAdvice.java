package com.grocery.cart.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.grocery.cart.service.ItemNotFoundException;
import com.grocery.cart.service.UserNotFoundException;




@ControllerAdvice
public class UserNotFoundExceptionAdvice {
	
	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String userAlreadyExistsExceptionHandler(UserNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ResponseBody
	@ExceptionHandler(ItemNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String ItemNotFoundExceptionHandler(ItemNotFoundException ex) {
		return ex.getMessage();
	}

}

