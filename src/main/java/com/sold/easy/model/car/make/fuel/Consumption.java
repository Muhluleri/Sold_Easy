package com.sold.easy.model.car.make.fuel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Consumption 
{
	@Id
	@SequenceGenerator(name = "consumption_id", sequenceName = "consumption_id_gen")
	@GeneratedValue( generator = "consumption_id_gen")
	private long id;
	private double rate;
	@Enumerated(EnumType.STRING)
	private ConsumptionType unit;

}
