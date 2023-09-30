package com.sold.easy.model.car.owner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Owner 
{
	@Id
	@SequenceGenerator(name = "owner_id" , sequenceName = "owner_id_gen")
	@GeneratedValue( generator = "owner_id_gen")
	private long id;
	private String name;
	private String surname;
	private String email;
	private String cellNo;
	private String altNo;
	private String idNumber;

} 
