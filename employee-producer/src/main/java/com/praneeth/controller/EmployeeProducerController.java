package com.praneeth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth.model.Employee;

@RestController
public class EmployeeProducerController {

	@RequestMapping("/")
	public List<Employee> getAllEmployeeDetails()

	{
		return Arrays.asList(new Employee(1, "praneeth", 20.0), new Employee(2, "vijay", 50));
	}
}
