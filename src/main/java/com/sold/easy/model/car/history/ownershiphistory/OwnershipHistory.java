package com.sold.easy.model.car.history.ownershiphistory;

public class OwnershipHistory 
{
	private Integer initialPrice;
	private String puchaseLocation;
	private Integer ownershipDuration;
	private boolean warranty;
	private boolean documentation;
	private Integer mileage;
	
	public OwnershipHistory(Integer initialPrice, String puchaseLocation, 
			                Integer ownershipDuration, boolean warranty,
			                boolean documentation, Integer mileage) 
	{
		this.initialPrice = initialPrice;
		this.puchaseLocation = puchaseLocation;
		this.ownershipDuration = ownershipDuration;
		this.warranty = warranty;
		this.documentation = documentation;
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
	public String getPuchaseLocation() {
		return puchaseLocation;
	}
	
	public void setPuchaseLocation(String puchaseLocation) 
	{
		this.puchaseLocation = puchaseLocation;
	}
	
	public Integer getOwnershipDuration()
	{
		return ownershipDuration;
	}
	
	public void setOwnershipDuration(Integer ownershipDuration) 
	{
		this.ownershipDuration = ownershipDuration;
	}
	
	public boolean isWarranty() 
	{
		return warranty;
	}
	
	public void setWarranty(boolean warranty) 
	{
		this.warranty = warranty;
	}
	
	public boolean isDocumentation() 
	{
		return documentation;
	}
	
	public void setDocumentation(boolean documentation) 
	{
		this.documentation = documentation;
	}
	
	public Integer getMileage() 
	{
		return mileage;
	}
	
	public void setMileage(Integer mileage) 
	{
		this.mileage = mileage;
	}
	
	

	
	
}
