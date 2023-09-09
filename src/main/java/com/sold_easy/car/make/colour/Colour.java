package com.sold_easy.car.make.colour;

public class Colour 
{
	private String externalColour;
	private String internalColour;
	
	public Colour(String externalColour, String internalColour) 
	{
		this.externalColour = externalColour;
		this.internalColour = internalColour;
	}

	public String getExternalColour() 
	{
		return externalColour;
	}

	public void setExternalColour(String externalColour)
	{
		this.externalColour = externalColour;
	}

	public String getInternalColour() 
	{
		return internalColour;
	}

	public void setInternalColour(String internalColour) 
	{
		this.internalColour = internalColour;
	}
	
}
