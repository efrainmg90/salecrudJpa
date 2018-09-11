package com.sistemas.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sistemas.demo.model.Product;

import com.sistemas.demo.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> findAll(){
		List<Product> listProduct = productService.findAll();
		return ResponseEntity.ok().body(listProduct);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findAll(@PathVariable("id") int id){
			Optional<Product> productOp = productService.findById(id);
		if(!productOp.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok().body(productOp.get());
	}
	
	
}
