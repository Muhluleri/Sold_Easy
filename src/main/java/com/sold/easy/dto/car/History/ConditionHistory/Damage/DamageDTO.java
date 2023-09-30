package com.sold.easy.dto.car.History.ConditionHistory.Damage;

import com.sold.easy.model.car.history.conditionhistory.DamageType;

public class DamageDTO 
{
	private DamageType damage;
	private String description;
	private String imageURL;
	
	public DamageType getDamage() 
	{
		return damage;
	}
	
	public void setDamage(DamageType damage) 
	{
		this.damage = damage;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getImageURL() 
	{
		return imageURL;
	}
	
	public void setImageURL(String imageURL)
	{
		this.imageURL = imageURL;
	}	
	
}
