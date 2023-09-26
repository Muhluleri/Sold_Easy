package com.sold.easy.model.car.extras.external;

import jakarta.persistence.*;

@Entity
public class ExternalExtraType 
{
	@Id
	@SequenceGenerator( name = "externalExtraType_id" , sequenceName = "externalExtraType_id_gen")
	@GeneratedValue( generator = "externalExtraType_id_gen")
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
