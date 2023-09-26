package com.sold.easy.model.car.history;

import java.util.List;

import com.sold.easy.model.car.history.conditionhistory.ConditionHistory;
import com.sold.easy.model.car.history.financehistory.FinanceHistory;
import com.sold.easy.model.car.history.licensehistory.LicenseHistory;
import com.sold.easy.model.car.history.ownershiphistory.OwnershipHistory;
import com.sold.easy.model.car.history.servicehistory.ServiceHistory;

public class History 
{
	//Checked
	private List<OwnershipHistory> ownershipHistory;
	//Checked
	private ConditionHistory conditionHistory;
	//Checked
	private FinanceHistory financeHistory;
	//Checked
	private ServiceHistory serviceHistory;
	//Checked
	private LicenseHistory licenseHistory;
	

	public List<OwnershipHistory> getOwnershipHistory() 
	{
		return ownershipHistory;
	}

	public void setOwnershipHistory(List<OwnershipHistory> ownershipHistory) 
	{
		this.ownershipHistory = ownershipHistory;
	}

	public ConditionHistory getConditionHistory() 
	{
		return conditionHistory;
	}

	public void setConditionHistory(ConditionHistory conditionHistory) 
	{
		this.conditionHistory = conditionHistory;
	}

	public FinanceHistory getFinanceHistory() 
	{
		return financeHistory;
	}

	public void setFinanceHistory(FinanceHistory financeHistory) 
	{
		this.financeHistory = financeHistory;
	}

	public ServiceHistory getServiceHistory() 
	{
		return serviceHistory;
	}

	public void setServiceHistory(ServiceHistory serviceHistory) 
	{
		this.serviceHistory = serviceHistory;
	}

	public LicenseHistory getLicenseHistory() 
	{
		return licenseHistory;
	}

	public void setLicenseHistory(LicenseHistory licenseHistory) 
	{
		this.licenseHistory = licenseHistory;
	}	
}
