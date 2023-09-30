package com.sold.easy.dto.client.Request;

import com.sold.easy.dto.client.Car;
import com.sold.easy.dto.sale.SaleDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientSaleRequest {

    private long clientId;
    private long profileId;
    private Car car;
    private SaleDTO sale;
    
	public long getClientId() 
	{
		return clientId;
	}
	
	public void setClientId(long clientId) 
	{
		this.clientId = clientId;
	}
	
	public long getProfileId() 
	{
		return profileId;
	}
	
	public void setProfileId(long profileId) 
	{
		this.profileId = profileId;
	}
	
	public Car getCar() 
	{
		return car;
	}
	
	public void setCar(Car car) 
	{
		this.car = car;
	}
	
	public SaleDTO getSale() 
	{
		return sale;
	}
	
	public void setSale(SaleDTO sale) 
	{
		this.sale = sale;
	}

}
