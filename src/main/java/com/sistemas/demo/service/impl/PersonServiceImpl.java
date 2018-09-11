package com.sistemas.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sistemas.demo.model.Person;
import com.sistemas.demo.repository.PersonRepository;
import com.sistemas.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	private PersonRepository personRepo;

	@Override
	public Person createOrUpdate(Person person) {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

	@Override
	public Optional<Person> findById(int id) {
		// TODO Auto-generated method stub
		return personRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personRepo.deleteById(id);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

}
