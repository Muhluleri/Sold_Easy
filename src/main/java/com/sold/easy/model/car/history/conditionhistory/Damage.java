package com.sold.easy.model.car.history.conditionhistory;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Damage 
{
	@Id
	@SequenceGenerator( name = " damage_id", sequenceName = "damage_id_gen")
	@GeneratedValue( generator = "damage_id_gen")
	private long id;
	private DamageType damage;
	private String description;
	private String imageURL;

}
