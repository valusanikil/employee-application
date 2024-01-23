package com.employee.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(NoDataFoundException.class)
	public String handleNoDataFoundException(NoDataFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(EmployeeAlreadyExistException.class)
	public String handleEmployeeAlreadyExistException(EmployeeAlreadyExistException ex) {
		return ex.getMessage();
	}
}
