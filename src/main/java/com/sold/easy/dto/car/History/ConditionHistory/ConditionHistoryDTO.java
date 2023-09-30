package com.sold.easy.dto.car.History.ConditionHistory;

import java.util.List;

import com.sold.easy.dto.car.History.ConditionHistory.Damage.DamageDTO;
import com.sold.easy.model.car.history.conditionhistory.ConditionType;

public class ConditionHistoryDTO
{
	private ConditionType conditon;
	private List<DamageDTO> damages;
	
	public ConditionType getConditon()
	{
		return conditon;
	}
	
	public void setConditon(ConditionType conditon) 
	{
		this.conditon = conditon;
	}
	
	public List<DamageDTO> getDamages()
	{
		return damages;
	}
	
	public void setDamages(List<DamageDTO> damages) 
	{
		this.damages = damages;
	}
	
}
