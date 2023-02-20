package com.azuresql.springbootazuresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azuresql.springbootazuresql.entity.Employee;
import com.azuresql.springbootazuresql.repository.EmployeeRepository;

@RestController
//@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee emp = null;
		try {
			 emp = employeeRepository.save(employee);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp ;
	}

	@GetMapping("/emplyees")
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/message")
	public String test() {
		return "Congrats Azure app service runs perfect";
	}
}
