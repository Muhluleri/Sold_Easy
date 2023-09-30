package com.sold.easy.mapping;

import org.springframework.stereotype.Component;
import com.sold.easy.dto.car.CarDTO;
import com.sold.easy.model.car.Car;

@Component
public class CarMapper 
{
	private OwnerMapper ownerMapper;
	private MakeMapper makeMapper;
	private ExtraMapper extraMapper;
	private HistoryMapper historyMapper;
	
	public Car mapCarToDomain(CarDTO carDTO)
	{
		Car car = new Car();
		car.setOwner(ownerMapper.mapOwnerToDomain(carDTO.getOwnerid()));
		car.setMake(makeMapper.mapMakeToDomain(carDTO.getMakeId()));
		car.setExtras(extraMapper.mapExtraToDomain(carDTO.getExtrasId()));
		car.setHistory(historyMapper.mapHistoryToDomain(carDTO.getHistory()));
		return car;
	}
}
