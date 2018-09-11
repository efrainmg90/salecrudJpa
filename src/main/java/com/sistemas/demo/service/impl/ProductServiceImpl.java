package com.sistemas.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.demo.model.Product;
import com.sistemas.demo.repository.ProductRepository;
import com.sistemas.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product createOrUpdate(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Optional<Product> findById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}
