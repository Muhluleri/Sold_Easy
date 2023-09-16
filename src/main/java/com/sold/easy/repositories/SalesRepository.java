package com.sold.easy.repositories;

import com.sold.easy.model.car.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> 
{
	
}
