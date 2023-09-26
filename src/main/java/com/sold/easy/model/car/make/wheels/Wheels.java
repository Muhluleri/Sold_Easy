package com.sold.easy.model.car.make.wheels;

import jakarta.persistence.*;

@Entity
public class Wheels
{
	@Id
	@SequenceGenerator( name = "wheels_id" , sequenceName = "wheels_id_gen")
	@GeneratedValue( generator = "wheels_id_gen")
	private long id;
	private String description; 
	private String tyresize;
	private Integer rimSize;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getTyresize() 
	{
		return tyresize;
	}

	public void setTyresize(String tyresize)
	{
		this.tyresize = tyresize;
	}

	public Integer getRimSize() 
	{
		return rimSize;
	}

	public void setRimSize(Integer rimSize) 
	{
		this.rimSize = rimSize;
	}

		
}
