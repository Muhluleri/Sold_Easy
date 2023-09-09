package com.sold.easy.model.car.make.wheels;

public class Wheels 
{
	private String description; 
	private String size;
	private Integer pressure;
	
	public Wheels(String description, String size, Integer pressure) 
	{
		this.description = description;
		this.size = size;
		this.pressure = pressure;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getSize() 
	{
		return size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public Integer getPressure() 
	{
		return pressure;
	}

	public void setPressure(Integer pressure) 
	{
		this.pressure = pressure;
	}
	
		
		
}
