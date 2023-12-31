package com.sold.easy.model.car.make.engine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Engine 
{
	@Id
	@SequenceGenerator( name = "engine_id" , sequenceName = "engine_id_gen")
	@GeneratedValue( generator = "engine_id_gen")
	private long id;
	private String engineNumber;
	private Integer noOfCylinders;
	private Integer torque;
	private Integer power;

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
