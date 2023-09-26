package com.sold.easy.model.car.make.colour;

import jakarta.persistence.*;

@Entity
public class ExternalColour 
{
	@Id
	@SequenceGenerator( name = "externalcolour_id" , sequenceName = "externalcolour_id_gen")
	@GeneratedValue (generator = "externalcolour_id_gen")
	private long id;
	private colourType colourtype;
	private String colour;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public colourType getColourtype()
	{
		return colourtype;
	}
	
	public void setColourtype(colourType colourtype) 
	{
		this.colourtype = colourtype;
	}
	
	public String getColour() 
	{
		return colour;
	}
	
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	
	
}
