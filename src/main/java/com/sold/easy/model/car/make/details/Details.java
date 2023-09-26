package com.sold.easy.model.car.make.details;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Details 
{
	@Id
	@SequenceGenerator( name = "detail_id" , sequenceName = "detail_id_gen")
	@GeneratedValue (generator = "detail_id_gen")
	private long id;
	private String make;
	private Integer year;
	private String model;
	private String chasisNumber;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getMake() 
	{
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getYear() 
	{
		return year;
	}

	public void setYear(Integer year) 
	{
		this.year = year;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public String getChasisNumber() 
	{
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) 
	{
		this.chasisNumber = chasisNumber;
	}
	
	
}
