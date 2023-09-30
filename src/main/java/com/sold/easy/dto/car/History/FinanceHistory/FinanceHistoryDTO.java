package com.sold.easy.dto.car.History.FinanceHistory;

public class FinanceHistoryDTO 
{
	private boolean financed;
	private double outstandingAmount;
	private double financedAmount;
	
	public boolean isFinanced() 
	{
		return financed;
	}
	
	public void setFinanced(boolean financed) 
	{
		this.financed = financed;
	}
	
	public double getOutstandingAmount() 
	{
		return outstandingAmount;
	}
	
	public void setOutstandingAmount(double outstandingAmount) 
	{
		this.outstandingAmount = outstandingAmount;
	}
	
	public double getFinancedAmount() 
	{
		return financedAmount;
	}
	
	public void setFinancedAmount(double financedAmount) 
	{
		this.financedAmount = financedAmount;
	}
}
