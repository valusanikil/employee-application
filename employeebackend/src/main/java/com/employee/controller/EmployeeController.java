package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeAlreadyExistException;
import com.employee.exception.EmployeeNotFoundException;
import com.employee.exception.NoDataFoundException;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("employees/{employeeId}")
	public Optional<Employee> getUserById(@PathVariable ("employeeId") int employeeId) throws EmployeeNotFoundException {
		Optional<Employee> employee= Optional.of(employeeService.getEmployeeById(employeeId).orElseThrow(
				()->new EmployeeNotFoundException("No employee found with the id : "+employeeId)));
		return employee;
	}
	
	@GetMapping("employees")
	public List<Employee> getEmployees() throws NoDataFoundException{
		List<Employee> employeeList=employeeService.getEmployees();
		if(employeeList.isEmpty()) {
			throw new NoDataFoundException("No employees found");
		}
		return employeeList;
	}
	
	@PostMapping("employees/employee")
	public Employee addUser(@Valid @RequestBody Employee employee) throws EmployeeAlreadyExistException {
		Employee existingEmployee=employeeService.getEmployeeById(employee.getEmployeeId())
				.orElse(null);
		if(existingEmployee==null) {
			return employeeService.addEmployee(employee);
		}
		else {
			throw new EmployeeAlreadyExistException("Employee already exists!!");
		}
	}
	
	
}
