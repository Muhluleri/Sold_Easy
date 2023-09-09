package com.sold.easy.model.car.history.servicehistory;

public class ServiceHistory 
{
	private String servicePlan;
	private String serviceHistory;
	
	public ServiceHistory(String servicePlan, String serviceHistory) 
	{
		this.servicePlan = servicePlan;
		this.serviceHistory = serviceHistory;
	}

	public String getServicePlan() 
	{
		return servicePlan;
	}

	public void setServicePlan(String servicePlan) 
	{
		this.servicePlan = servicePlan;
	}

	public String getServiceHistory() 
	{
		return serviceHistory;
	}

	public void setServiceHistory(String serviceHistory) 
	{
		this.serviceHistory = serviceHistory;
	}	
}
