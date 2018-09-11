package com.sistemas.demo.service;

import java.util.List;
import java.util.Optional;


public interface CrudService<T> {

	T createOrUpdate(T t);
	
	Optional<T> findById(int id);
	
	void delete(int id);
	
	List<T> findAll();


}
