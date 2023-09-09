package com.sold_easy.car.make.details;

public class Details 
{
	private String make;
	private Integer year;
	private String model;
	
	public Details(String make, Integer year, String model) 
	{
		this.make = make;
		this.year = year;
		this.model = model;
	}

	public String getMake() 
	{
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getYear() 
	{
		return year;
	}

	public void setYear(Integer year) 
	{
		this.year = year;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}
	
}
