package com.sold.easy.model.car.make;

import com.sold.easy.model.car.make.colour.Colour;
import com.sold.easy.model.car.make.engine.Engine;
import com.sold.easy.model.car.make.fuel.Fuel;
import com.sold.easy.model.car.make.wheels.Wheels;

import jakarta.persistence.*;

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
	@OneToOne
	private Details details;
	//Checked
	@OneToOne
	private Engine engine;
	//Checked
	@OneToOne
	private Transmission transmission;
	//Checked
	@OneToOne
	private Fuel fuel;
	//Checked
	@OneToOne
	private Wheels wheels;
	//Checked
	@OneToOne
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
