package com.sold.easy.model.car.history.conditionhistory;

import jakarta.persistence.*;

@Entity
public class Damage 
{
	@Id
	@SequenceGenerator( name = " damage_id", sequenceName = "damage_id_gen")
	@GeneratedValue( generator = "damage_id_gen")
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
