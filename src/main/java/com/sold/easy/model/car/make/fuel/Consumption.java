package com.sold.easy.model.car.make.fuel;

import jakarta.persistence.*;

@Entity
public class Consumption 
{
	@Id
	@SequenceGenerator(name = "consumption_id", sequenceName = "consumption_id_gen")
	@GeneratedValue( generator = "consumption_id_gen")
	private long id;
	private double rate;
	private ConsumptionType unit;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public double getRate() 
	{
		return rate;
	}
	
	public void setRate(double rate) 
	{
		this.rate = rate;
	}
	
	public ConsumptionType getUnit() 
	{
		return unit;
	}
	
	public void setUnit(ConsumptionType unit)
	{
		this.unit = unit;
	}
	
}
