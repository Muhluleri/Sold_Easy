package com.sold.easy.mapping;

import org.springframework.stereotype.Component;
import com.sold.easy.model.car.make.Make;
import com.sold.easy.repositories.Car.Make.MakeRepository;

@Component
public class MakeMapper 
{
	private MakeRepository makeRepository;
	
	public Make mapMakeToDomain(long makeId)
	{
		Make make = makeRepository.findById(makeId).get();
		return make;
	}
}
