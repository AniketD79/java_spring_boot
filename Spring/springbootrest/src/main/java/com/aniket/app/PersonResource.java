package com.aniket.app;

import java.util.ArrayList;
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
	public List<Person> getPerson() {
		
		List<Person> persons = (List<Person>)repo.findAll();
		
		
//Person22.Address addr1= new Person22.Address("Pune", "411057", "Maharashtra");
//
//Person22 p1 = new Person("Aniket",27, addr1, "7499960264");
//
//
//Person22.Address addr2= new Person22.Address("HongKong", "123456", "HK");
//		Person22 p2 = new Person22("Bunny",22, addr2, "9999999999");
//		persons.add(p1);
//		persons.add(p2);
		
		return persons;
	}

	@GetMapping("/personById")
	public Person getPersonById(@RequestParam Long id){
		
		Person person = (Person) repo.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
		return person;
		
	}

}
