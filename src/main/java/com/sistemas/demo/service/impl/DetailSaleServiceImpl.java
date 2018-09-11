package com.sistemas.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.demo.model.DetailSale;
import com.sistemas.demo.repository.DetailSaleRepository;
import com.sistemas.demo.service.DetailSaleService;

@Service
public class DetailSaleServiceImpl implements DetailSaleService{

	@Autowired
	DetailSaleRepository detailSaleRepo;
	
	@Override
	public DetailSale createOrUpdate(DetailSale detailSale) {
		// TODO Auto-generated method stub
		return detailSaleRepo.save(detailSale);
	}

	@Override
	public Optional<DetailSale> findById(int id) {
		// TODO Auto-generated method stub
		return detailSaleRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		detailSaleRepo.deleteById(id);
	}

	@Override
	public List<DetailSale> findAll() {
		// TODO Auto-generated method stub
		return detailSaleRepo.findAll();
	}

}
