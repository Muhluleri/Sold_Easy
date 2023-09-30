package com.sold.easy.model.car.make.transmission;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transmission 
{
	@Id
	@SequenceGenerator( name = "transmission_id" , sequenceName = "trasmission_id_gen")
	@GeneratedValue(generator = "transmission_id_gen")
	private TranmsionType type;
	private String noOfGears;
	private String driveWheels;
	
}
