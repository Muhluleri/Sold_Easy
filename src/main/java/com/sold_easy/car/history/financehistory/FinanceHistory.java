package com.sold_easy.car.history.financehistory;

public class FinanceHistory 
{
	private boolean financed;
	private Integer outstandingAmount;
	
	public FinanceHistory(boolean financed)
	{
		this.financed = financed;
		if (!financed)
		{
			this.outstandingAmount = 0 ;
		}
	}
	
	public FinanceHistory(boolean financed, Integer outstandingAmount) 
	{
		this.financed = financed;
		this.outstandingAmount = outstandingAmount;
	}

	public boolean isFinanced() 
	{
		return financed;
	}

	public void setFinanced(boolean financed) 
	{
		this.financed = financed;
	}

	public Integer getOutstandingAmount() 
	{
		return outstandingAmount;
	}

	public void setOutstandingAmount(Integer outstandingAmount)
	{
		this.outstandingAmount = outstandingAmount;
	}
	
	
}
