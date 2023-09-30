package com.sold.easy.repositories.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sold.easy.model.car.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>
{

}
