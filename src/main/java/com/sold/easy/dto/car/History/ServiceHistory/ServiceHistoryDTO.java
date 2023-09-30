package com.sold.easy.dto.car.History.ServiceHistory;

import java.util.List;

import com.sold.easy.dto.car.History.ServiceHistory.Service.ServiceDTO;

public class ServiceHistoryDTO 
{
	private String servicePlan;
	private List<ServiceDTO> services;
	
	public String getServicePlan() 
	{
		return servicePlan;
	}
	
	public void setServicePlan(String servicePlan)
{
		this.servicePlan = servicePlan;
	}
	
	public List<ServiceDTO> getServices() 
	{
		return services;
	}
	
	public void setServices(List<ServiceDTO> services) 
	{
		this.services = services;
	}
	
	
}
