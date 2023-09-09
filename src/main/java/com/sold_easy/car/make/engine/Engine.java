package com.sold_easy.car.make.engine;

public class Engine 
{
	private String engineNumber;
	private Integer noOfCylinders;
	private Integer torque;
	private Integer power;
	
	public Engine(String engineNumber,Integer noOfCylinders, Integer torque, Integer power) 
	{
		this.engineNumber = engineNumber;
		this.noOfCylinders = noOfCylinders;
		this.torque = torque;
		this.power = power;
	}

	public String getEngineNumber() 
	{
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) 
	{
		this.engineNumber = engineNumber;
	}

	public Integer getNoOfCylinders() 
	{
		return noOfCylinders;
	}

	public void setNoOfCylinders(Integer noOfCylinders) 
	{
		this.noOfCylinders = noOfCylinders;
	}

	public Integer getTorque()
	{
		return torque;
	}

	public void setTorque(Integer torque) 
	{
		this.torque = torque;
	}

	public Integer getPower() 
	{
		return power;
	}

	public void setPower(Integer power) 
	{
		this.power = power;
	}
	
	
	
	
}
