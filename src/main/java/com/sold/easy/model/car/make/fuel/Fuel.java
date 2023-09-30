package com.sold.easy.model.car.make.fuel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fuel 
{
	@Id
	@SequenceGenerator( name = "fuel_id" , sequenceName = "fuel_id_gen")
	@GeneratedValue( generator = "fuel_id_gen")
	private long id;
	private String type;
	@OneToOne
	private Consumption consumption;
	private String system;
	private Integer capacity;
	private Integer range;
	
}
