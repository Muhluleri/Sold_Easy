package com.sold.easy.dto.car.History.LicenseHistory;

import java.util.Date;

public class LicenseHistoryDTO 
{
	private boolean validLicense;
	private Date dateOfExpiry;
	private String vehicleRegister;
	
	public boolean isValidLicense() 
	{
		return validLicense;
	}
	
	public void setValidLicense(boolean validLicense) 
	{
		this.validLicense = validLicense;
	}
	
	public Date getDateOfExpiry()
	{
		return dateOfExpiry;
	}
	
	public void setDateOfExpiry(Date dateOfExpiry) 
	{
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public String getVehicleRegister() 
	{
		return vehicleRegister;
	}
	
	public void setVehicleRegister(String vehicleRegister)
	{
		this.vehicleRegister = vehicleRegister;
	}
	
}
