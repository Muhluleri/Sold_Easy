package com.sold_easy.car.make.details;

public class Details 
{
	private String make;
	private Integer year;
	private String model;
	private String chasisNumber;
	
	public Details(String make, Integer year, String model, String chasisNumber) 
	{
		this.make = make;
		this.year = year;
		this.model = model;
		this.chasisNumber = chasisNumber;
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

	public String getChasisNumber() 
	{
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) 
	{
		this.chasisNumber = chasisNumber;
	}
	
	
}
