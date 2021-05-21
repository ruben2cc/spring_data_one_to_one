package com.benito.onetoone;

import org.springframework.data.repository.CrudRepository;

import com.benito.onetoone.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
