package com.sold.easy.repositories.Car.Make;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sold.easy.model.car.make.Make;

@Repository
public interface MakeRepository extends JpaRepository<Make,Long> 
{

}
