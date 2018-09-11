package com.sistemas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.demo.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
