package com.sold.easy.model.car.history.licensehistory;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class LicenseHistory 
{
	@Id
	@SequenceGenerator( name = "licenseHistory_id", sequenceName = "licenseHistory_id_gen")
	@GeneratedValue( generator = "licenseHistory_id_gen")
	private long id;
	private boolean validLicense;
	private Date dateOfExpiry;
	private String vehicleRegister;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
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
