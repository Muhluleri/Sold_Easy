package com.sold.easy.model.car;

import java.util.List;

import com.sold.easy.model.car.extras.Extras;
import com.sold.easy.model.car.history.History;
import com.sold.easy.model.car.make.Make;
import com.sold.easy.model.car.owner.Owner;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car 
{
	@Id
	@SequenceGenerator(name =" car_id" , sequenceName = "car_id_gen")
	@GeneratedValue(generator = "car_id_gen")
	private long id;
	//Checked

	@OneToOne
	private Owner owner;
	//Checked
	@OneToOne
	private Make make;
	//Checked
	@OneToMany
	private List<Extras> extras;
	//Checked
	@OneToOne
	private History history;
	
}
