package com.example.crudpractice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(Person person) {
		
		return personRepository.save(person);
	}
	
	
	
	

	public Person getPersonById(Integer id) {
		
		Optional<Person> person=personRepository.findById(id);
		if(person.isEmpty()) {
			return null;
		}
		return person.get();
	}
}
