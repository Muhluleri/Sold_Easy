package com.sold.easy.mapping;

import org.springframework.stereotype.Component;
import com.sold.easy.dto.car.History.ConditionHistory.ConditionHistoryDTO;
import com.sold.easy.model.car.history.conditionhistory.ConditionHistory;

@Component
public class ConditionHistoryMapper 
{
	private DamageMapper damageMapper;
	
	public ConditionHistory mapConditionHistoryToDomain(ConditionHistoryDTO conditionHistoryDTO)
	{
		ConditionHistory conditionHistory = new ConditionHistory();
		conditionHistory.setCondition(conditionHistoryDTO.getConditon());
		conditionHistory.setDamages(damageMapper.mapDamageToDomain(conditionHistoryDTO.getDamages()));
		return conditionHistory;
	}
}
