package com.sold.easy.model.car.history.servicehistory;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class ServiceHistory 
{
	@Id
	@SequenceGenerator(name = "serviceHistory_id", sequenceName = "serviceHistory_id_gen")
	@GeneratedValue ( generator = "serviceHistory_id_gen")
	private long id;
	private String servicePlan;
	private List<Service> services;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public List<Service> getServices() 
	{
		return services;
	}

	public void setServices(List<Service> services) 
	{
		this.services = services;
	}

	public String getServicePlan() 
	{
		return servicePlan;
	}

	public void setServicePlan(String servicePlan) 
	{
		this.servicePlan = servicePlan;
	}

}
