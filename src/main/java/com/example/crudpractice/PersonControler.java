package com.example.crudpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControler {

	
	@Autowired
	private PersonService personService;
	
	
	@PostMapping("/add")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	
	@GetMapping("/get/{id}")
	public Person getPersonById(@PathVariable("id")Integer id) {
		return personService.getPersonById(id);
	}
}
