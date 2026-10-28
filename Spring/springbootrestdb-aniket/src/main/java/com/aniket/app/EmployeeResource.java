package com.aniket.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
//	final
	@Autowired
	EmployeeRepo repo;

//	EmployeeResource(EmployeeRepo repo) {
//		this.repo = repo;
//	}
	
	@GetMapping("/getemployees")
	public List<Employee> getemployee(){
		
		List<Employee> employees = (List<Employee>) repo.findAll();
		System.out.print(employees.toString());
		return employees;
		
	}
	
	
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable Long id)
	{
		return (Employee) repo.findById(id).orElseThrow(()-> new RuntimeException("No Record!"));
		
		
	}

}
