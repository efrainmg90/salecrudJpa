package com.sistemas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
