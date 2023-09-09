package com.sold.easy.model.car.history.conditionhistory;

public class ConditionHistory
{
	private String condition;
	private String damageHistory;
	
	public ConditionHistory(String condition, String damageHistory)
	{
		this.condition = condition;
		this.damageHistory = damageHistory;
	}

	public String getCondition() 
	{
		return condition;
	}

	public void setCondition(String condition) 
	{
		this.condition = condition;
	}

	public String getDamageHistory() 
	{
		return damageHistory;
	}

	public void setDamageHistory(String damageHistory) 
	{
		this.damageHistory = damageHistory;
	}
	
	
}
