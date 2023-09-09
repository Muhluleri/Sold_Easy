package com.sold_easy.car.make.engine;

public class Engine 
{
	private Integer noOfCylinders;
	private Integer torque;
	private Integer power;
	
	public Engine(Integer noOfCylinders, Integer torque, Integer power) 
	{
		this.noOfCylinders = noOfCylinders;
		this.torque = torque;
		this.power = power;
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
