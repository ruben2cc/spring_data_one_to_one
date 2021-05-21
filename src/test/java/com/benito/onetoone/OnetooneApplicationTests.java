package com.benito.onetoone;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.benito.onetoone.entities.License;
import com.benito.onetoone.entities.Person;

@SpringBootTest
class OnetooneApplicationTests {
	
	@Autowired
	private PersonRepository repo;

	@Test
	void testPersonSave() {
		
		Person person = new Person("Ruben", "Benito", 15);
		License license = new License("coche", new Date(), new Date());
		license.setPerson(person);
		person.setLicense(license);
		repo.save(person);
	}

}
