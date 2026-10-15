package com.aniket.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PersonResource {

	@Autowired
	PersonRepo repo;
	
	@GetMapping("/person")
	public List<Person> getPerson(){
		
		 List<Person> persons = (List<Person>)repo.findAll();
		 System.out.print(persons.toString());
		 return persons;
		
	}
	
	
	@GetMapping("/personById")
	public Person getPersonById(@RequestParam Long id) {
		
		Person person = (Person)repo.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
		return person;
	}
	
	
}
