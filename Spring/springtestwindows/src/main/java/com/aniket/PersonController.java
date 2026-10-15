package com.aniket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	
	@GetMapping("/person")
	public List<Person> getPersons(){
		
		List<Person> persons = (List<Person>) repo.findAll();
		System.out.print(persons);
		return persons;
		
	}
}
