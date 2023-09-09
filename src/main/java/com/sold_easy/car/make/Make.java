package com.sold_easy.car.make;

import com.sold_easy.car.make.colour.Colour;
import com.sold_easy.car.make.details.Details;
import com.sold_easy.car.make.engine.Engine;
import com.sold_easy.car.make.fuel.Fuel;
import com.sold_easy.car.make.transmission.Transmission;
import com.sold_easy.car.make.wheels.Wheels;

public class Make 
{
	private Details details;
	private Engine engine;
	private Transmission transmission;
	private Fuel fuel;
	private Wheels wheels;
	private Colour colour;
	
	public Make(Details details, Engine engine, Transmission transmission, 
				Fuel fuel, Wheels wheels, Colour colour) 
	{
		this.details = details;
		this.engine = engine;
		this.transmission = transmission;
		this.fuel = fuel;
		this.wheels = wheels;
		this.colour = colour;
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
