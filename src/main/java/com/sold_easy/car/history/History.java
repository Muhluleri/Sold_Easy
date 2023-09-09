package com.sold_easy.car.history;

public class History 
{
	private Integer mileage;
	private Integer initialPrice;
	private String puchaseLocation;
	private String servicePlan;
	private String serviceHistory;
	private boolean warranty;
	private Integer ownershipDuration;
	
	public History(Integer mileage, Integer initialPrice, String puchaseLocation, String servicePlan,
			       String serviceHistory, boolean warranty, 
			       Integer ownershipDuration) 
	{
		
		this.mileage = mileage;
		this.initialPrice = initialPrice;
		this.puchaseLocation = puchaseLocation;
		this.servicePlan = servicePlan;
		this.serviceHistory = serviceHistory;
		this.warranty = warranty;
		this.ownershipDuration = ownershipDuration;
	}

	public Integer getMileage() 
	{
		return mileage;
	}

	public void setMileage(Integer mileage) 
	{
		this.mileage = mileage;
	}

	public Integer getInitialPrice() 
	{
		return initialPrice;
	}

	public void setInitialPrice(Integer initialPrice) 
	{
		this.initialPrice = initialPrice;
	}

	public String getPuchaseLocation() 
	{
		return puchaseLocation;
	}

	public void setPuchaseLocation(String puchaseLocation) 
	{
		this.puchaseLocation = puchaseLocation;
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

	public boolean isWarranty()
	{
		return warranty;
	}

	public void setWarranty(boolean warranty)
	{
		this.warranty = warranty;
	}

	public Integer getOwnershipDuration() 
	{
		return ownershipDuration;
	}

	public void setOwnershipDuration(Integer ownershipDuration) 
	{
		this.ownershipDuration = ownershipDuration;
	}
	
		
	
}
