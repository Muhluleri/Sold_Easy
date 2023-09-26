package com.sold.easy.model.car.history.financehistory;

import jakarta.persistence.*;

public class FinanceHistory 
{
	@Id
	@SequenceGenerator( name = "financeHistory_id" , sequenceName = "financeHistory_id_gen")
	@GeneratedValue( generator = "financeHistory_id_gen")
	private long id;
	private boolean financed;
	private double outstandingAmount;
	private double financedAmount;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public double getFinancedAmount() 
	{
		return financedAmount;
	}

	public void setFinancedAmount(double financedAmount) 
	{
		this.financedAmount = financedAmount;
	}

	public FinanceHistory(boolean financed)
	{
		this.financed = financed;
		if (!financed)
		{
			this.outstandingAmount = 0 ;
		}
	}
	
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
	
	
}
