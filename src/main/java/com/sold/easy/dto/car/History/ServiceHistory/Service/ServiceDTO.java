package com.sold.easy.dto.car.History.ServiceHistory.Service;

import java.util.Date;

public class ServiceDTO 
{
	private Date serviceDate;
	private Integer serviceMilleage;
	private String serviceDealer;
	
	public Date getServiceDate() 
	{
		return serviceDate;
	}
	
	public void setServiceDate(Date serviceDate) 
	{
		this.serviceDate = serviceDate;
	}
	
	public Integer getServiceMilleage() 
	{
		return serviceMilleage;
	}
	
	public void setServiceMilleage(Integer serviceMilleage) 
	{
		this.serviceMilleage = serviceMilleage;
	}
	
	public String getServiceDealer() 
	{
		return serviceDealer;
	}
	
	public void setServiceDealer(String serviceDealer) 
	{
		this.serviceDealer = serviceDealer;
	}
}
