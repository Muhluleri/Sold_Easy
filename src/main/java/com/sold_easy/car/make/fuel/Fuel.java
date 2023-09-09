package com.sold_easy.car.make.fuel;

public class Fuel 
{
	private String type;
	private Integer consumption;
	private String driveWheels;
	private String system;
	private Integer capacity;
	private Integer range;
	
	public Fuel(String type, Integer consumption, String driveWheels, 
			    String system, Integer capacity, Integer range) 
	{
		this.type = type;
		this.consumption = consumption;
		this.driveWheels = driveWheels;
		this.system = system;
		this.capacity = capacity;
		this.range = range;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public Integer getConsumption() 
	{
		return consumption;
	}

	public void setConsumption(Integer consumption) 
	{
		this.consumption = consumption;
	}

	public String getDriveWheels() 
	{
		return driveWheels;
	}

	public void setDriveWheels(String driveWheels) 
	{
		this.driveWheels = driveWheels;
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
