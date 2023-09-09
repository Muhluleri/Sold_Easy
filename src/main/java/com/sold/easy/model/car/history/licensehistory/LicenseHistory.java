package com.sold.easy.model.car.history.licensehistory;

import java.util.Date;

public class LicenseHistory 
{
	private boolean validLicense;
	private Date dateOfExpiry;
	private String vehicleRegister;
	
	public LicenseHistory(boolean validLicense, Date dateOfExpiry, 
			              String vehicleRegister) 
	{
		this.validLicense = validLicense;
		this.dateOfExpiry = dateOfExpiry;
		this.vehicleRegister = vehicleRegister;
	}

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
