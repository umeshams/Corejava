package com.example.crudpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}

	public Person getPersonById(Integer id) {
		
		return personDao.getPersonById(id);
	}
	
	
	
}
