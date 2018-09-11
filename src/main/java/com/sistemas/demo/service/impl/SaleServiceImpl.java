package com.sistemas.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sistemas.demo.model.Sale;
import com.sistemas.demo.repository.SaleRepository;
import com.sistemas.demo.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService{

	private SaleRepository saleRepo;
	@Override
	public Sale createOrUpdate(Sale sale) {
		// TODO Auto-generated method stub
		return saleRepo.save(sale);
	}

	@Override
	public Optional<Sale> findById(int id) {
		// TODO Auto-generated method stub
		return saleRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		saleRepo.deleteById(id);
	}

	@Override
	public List<Sale> findAll() {
		// TODO Auto-generated method stub
		return saleRepo.findAll();
	}

}
