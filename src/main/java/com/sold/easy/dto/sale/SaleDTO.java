package com.sold.easy.dto.sale;

import com.sold.easy.dto.car.CarDTO;
import com.sold.easy.dto.client.ClientDTO;
import com.sold.easy.dto.profile.ProfileDTO;

public class SaleDTO 
{
	private long id;
	private ClientDTO client;
	private ProfileDTO profile;
	private CarDTO car;
	
	public ClientDTO getClient() 
	{
		return client;
	}
	
	public void setClient(ClientDTO client) 
	{
		this.client = client;
	}
	
	public ProfileDTO getProfile()
	{
		return profile;
	}
	
	public void setProfile(ProfileDTO profile) 
	{
		this.profile = profile;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public CarDTO getCar() 
	{
		return car;
	}

	public void setCar(CarDTO car) 
	{
		this.car = car;
	}

}
