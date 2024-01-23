package com.employee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int employeeId;
	
	@NotNull(message="name cannot be null")
	@Pattern(regexp="^[a-zA-Z]+ [a-zA-Z]+$",message="name should not contain special characters")
	private String employeeName;
	
	@NotNull(message="salary cannot be null")
	private long employeeSalary;
	
	@NotNull(message="email cannot be empty")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="email format:abc@example.com")
	private String employeeEmail;
	
	@NotNull(message="phone cannot be empty")
	@Pattern(regexp="^[6-9]{1}[0-9]{9}$", message="phone number starts with 6 to 9 and contain 10 digits")
	private String employeeContactNo;
}
