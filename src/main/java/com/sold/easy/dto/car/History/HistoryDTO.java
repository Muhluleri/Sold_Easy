package com.sold.easy.dto.car.History;

import java.util.List;
import com.sold.easy.dto.car.History.ConditionHistory.ConditionHistoryDTO;
import com.sold.easy.dto.car.History.FinanceHistory.FinanceHistoryDTO;
import com.sold.easy.dto.car.History.LicenseHistory.LicenseHistoryDTO;
import com.sold.easy.dto.car.History.OwnershipHistory.OwnershipHistoryDTO;
import com.sold.easy.dto.car.History.ServiceHistory.ServiceHistoryDTO;

public class HistoryDTO 
{
	//Create DTOs for all the histories
	private List<OwnershipHistoryDTO> ownershipHistory;
	private ConditionHistoryDTO conditionHistory;
	private FinanceHistoryDTO financeHistory;
	private ServiceHistoryDTO serviceHistory;
	private LicenseHistoryDTO licenseHistory;
	
	public List<OwnershipHistoryDTO> getOwnershipHistory() {
		return ownershipHistory;
	}
	public void setOwnershipHistory(List<OwnershipHistoryDTO> ownershipHistory) {
		this.ownershipHistory = ownershipHistory;
	}
	public ConditionHistoryDTO getConditionHistory() {
		return conditionHistory;
	}
	public void setConditionHistory(ConditionHistoryDTO conditionHistory) {
		this.conditionHistory = conditionHistory;
	}
	public FinanceHistoryDTO getFinanceHistory() {
		return financeHistory;
	}
	public void setFinanceHistory(FinanceHistoryDTO financeHistory) {
		this.financeHistory = financeHistory;
	}
	public ServiceHistoryDTO getServiceHistory() {
		return serviceHistory;
	}
	public void setServiceHistory(ServiceHistoryDTO serviceHistory) {
		this.serviceHistory = serviceHistory;
	}
	public LicenseHistoryDTO getLicenseHistory() {
		return licenseHistory;
	}
	public void setLicenseHistory(LicenseHistoryDTO licenseHistory) {
		this.licenseHistory = licenseHistory;
	}
	
	
}

