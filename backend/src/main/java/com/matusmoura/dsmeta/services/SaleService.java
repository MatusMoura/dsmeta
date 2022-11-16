package com.matusmoura.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matusmoura.dsmeta.SaleRepository;
import com.matusmoura.dsmeta.entities.Sale;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List <Sale> findSales() {
		return repository.findAll();
	}
}
