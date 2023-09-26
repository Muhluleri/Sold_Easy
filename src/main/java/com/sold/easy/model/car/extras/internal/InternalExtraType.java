package com.sold.easy.model.car.extras.internal;

import jakarta.persistence.*;

@Entity
public class InternalExtraType
{
	@Id
	@SequenceGenerator( name = "internalExtraType_id" , sequenceName = "internalExtraType_id")
	@GeneratedValue( generator = "internalExtraType_id_gen")
	private long id;
	private String name;
	
	public long getId() 
	{
		return id;
	}
	
	public void setId(long id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
}
