package com.sold_easy.car.history;

import com.sold_easy.car.history.conditionhistory.ConditionHistory;
import com.sold_easy.car.history.financehistory.FinanceHistory;
import com.sold_easy.car.history.licensehistory.LicenseHistory;
import com.sold_easy.car.history.ownershiphistory.OwnershipHistory;
import com.sold_easy.car.history.servicehistory.ServiceHistory;

public class History 
{
	private OwnershipHistory ownershipHistory;
	private ConditionHistory conditionHistory;
	private FinanceHistory financeHistory;
	private ServiceHistory serviceHistory;
	private LicenseHistory licenseHistory;
	
	public History(OwnershipHistory ownershipHistory, ConditionHistory conditionHistory, 
			       FinanceHistory financeHistory,ServiceHistory serviceHistory, 
			       LicenseHistory licenseHistory) 
	{
		this.ownershipHistory = ownershipHistory;
		this.conditionHistory = conditionHistory;
		this.financeHistory = financeHistory;
		this.serviceHistory = serviceHistory;
		this.licenseHistory = licenseHistory;
	}

	public OwnershipHistory getOwnershipHistory() 
	{
		return ownershipHistory;
	}

	public void setOwnershipHistory(OwnershipHistory ownershipHistory) 
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
