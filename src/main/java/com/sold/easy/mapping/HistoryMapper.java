package com.sold.easy.mapping;

import org.springframework.stereotype.Component;
import com.sold.easy.dto.car.History.HistoryDTO;
import com.sold.easy.model.car.history.History;

@Component
public class HistoryMapper
{
	public History mapHistoryToDomain(HistoryDTO historyDTO)
	{
		History history = new History();
		history.setConditionHistory(null);
		history.setFinanceHistory(null);
		history.setLicenseHistory(null);
		history.setOwnershipHistory(null);
		history.setServiceHistory(null);
		return history;
	}
}
