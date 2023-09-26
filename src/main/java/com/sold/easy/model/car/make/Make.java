package com.sold.easy.model.car.make;

import com.sold.easy.model.car.make.colour.Colour;
import com.sold.easy.model.car.make.engine.Engine;
import com.sold.easy.model.car.make.fuel.Fuel;
import com.sold.easy.model.car.make.wheels.Wheels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import com.sold.easy.model.car.make.details.Details;
import com.sold.easy.model.car.make.transmission.Transmission;

@Entity
public class Make 
{
	@Id
	@SequenceGenerator(name = "make_id" , sequenceName = "make_id_gen")
	@GeneratedValue( generator = "make_id_gen")
	private long id;
	//Checked
	private Details details;
	//Checked
	private Engine engine;
	//Checked
	private Transmission transmission;
	//Checked
	private Fuel fuel;
	//Checked
	private Wheels wheels;
	//Checked
	private Colour colour;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public Details getDetails() 
	{
		return details;
	}

	public void setDetails(Details details) 
	{
		this.details = details;
	}

	public Engine getEngine() 
	{
		return engine;
	}

	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}

	public Transmission getTransmission() 
	{
		return transmission;
	}

	public void setTransmission(Transmission transmission) 
	{
		this.transmission = transmission;
	}

	public Fuel getFuel()
	{
		return fuel;
	}

	public void setFuel(Fuel fuel) 
	{
		this.fuel = fuel;
	}

	public Wheels getWheels() 
	{
		return wheels;
	}

	public void setWheels(Wheels wheels) 
	{
		this.wheels = wheels;
	}

	public Colour getColour() 
	{
		return colour;
	}

	public void setColour(Colour colour)
	{
		this.colour = colour;
	}
	
	
	
	
	
}
