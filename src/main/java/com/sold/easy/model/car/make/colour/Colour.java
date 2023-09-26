package com.sold.easy.model.car.make.colour;

import jakarta.persistence.*;

@Entity
public class Colour 
{
	@Id
	@SequenceGenerator( name = "colour_id" , sequenceName = "colour_id_gen")
	@GeneratedValue( generator = "colour_id_gen")
	private long id;
	private ExternalColour externalColour;
	private String internalColour;

	public ExternalColour getExternalColour() 
	{
		return externalColour;
	}

	public void setExternalColour(ExternalColour externalColour)
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
