package com.matusmoura.dsmeta;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matusmoura.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	
}
