package com.sold.easy.model.car.make.fuel;

import jakarta.persistence.*;

@Entity
public class Fuel 
{
	@Id
	@SequenceGenerator( name = "fuel_id" , sequenceName = "fuel_id_gen")
	@GeneratedValue( generator = "fuel_id_gen")
	private long id;
	private String type;
	private Consumption consumption;
	private String system;
	private Integer capacity;
	private Integer range;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public Consumption getConsumption() 
	{
		return consumption;
	}

	public void setConsumption(Consumption consumption) 
	{
		this.consumption = consumption;
	}

	public String getSystem() 
	{
		return system;
	}

	public void setSystem(String system) 
	{
		this.system = system;
	}

	public Integer getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(Integer capacity) 
	{
		this.capacity = capacity;
	}

	public Integer getRange() 
	{
		return range;
	}

	public void setRange(Integer range) 
	{
		this.range = range;
	}
	
	
	
	
}
