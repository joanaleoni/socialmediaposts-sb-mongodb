package com.joana.socialmediaposts.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.joana.socialmediaposts.services.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		Long timestamp = System.currentTimeMillis();
		HttpStatus status = HttpStatus.NOT_FOUND;
		String error = "Not found";
		String message = e.getMessage();
		String path = request.getRequestURI();
		
		StandardError err = new StandardError(timestamp, status.value(), error, message, path);
		return ResponseEntity.status(status).body(err);	
	}
}