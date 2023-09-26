package com.sold.easy.model.car.history.conditionhistory;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class ConditionHistory
{
	@Id
	@SequenceGenerator(name = "conditionHistory_id" , sequenceName = "conditionHistory_id_gen")
	@GeneratedValue( generator = "conditionHistory_id_gen")
	private long id;
	private ConditionType condition;
	private List<Damage> damages;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public ConditionType getCondition() 
	{
		return condition;
	}

	public void setCondition(ConditionType condition) 
	{
		this.condition = condition;
	}

	public List<Damage> getDamages() 
	{
		return damages;
	}

	public void setDamages(List<Damage> damages) {
		this.damages = damages;
	}
	
}
