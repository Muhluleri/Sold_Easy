package com.sold.easy.repositories.Sale;

import com.sold.easy.model.car.Sale;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> 
{

	List<Sale> findByRegistered(boolean registered);
	
}
