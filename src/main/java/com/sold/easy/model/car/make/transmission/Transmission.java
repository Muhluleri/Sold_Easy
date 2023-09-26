package com.sold.easy.model.car.make.transmission;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Transmission 
{
	@Id
	@SequenceGenerator( name = "transmission_id" , sequenceName = "trasmission_id_gen")
	@GeneratedValue(generator = "transmission_id_gen")
	private TranmsionType type;
	private String noOfGears;
	private String driveWheels;

	public String getDriveWheels() 
	{
		return driveWheels;
	}

	public void setDriveWheels(String driveWheels) 
	{
		this.driveWheels = driveWheels;
	}

	public TranmsionType getType() 
	{
		return type;
	}

	public void setType(TranmsionType type) 
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
