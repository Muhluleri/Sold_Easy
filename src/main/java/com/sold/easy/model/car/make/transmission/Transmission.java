package com.sold.easy.model.car.make.transmission;

public class Transmission 
{
	private String type;
	private String noOfGears;
	
	public Transmission(String type, String noOfGears) 
	{
		this.type = type;
		this.noOfGears = noOfGears;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getNoOfGears() 
	{
		return noOfGears;
	}

	public void setNoOfGears(String noOfGears) 
	{
		this.noOfGears = noOfGears;
	}
	
	
	
}
