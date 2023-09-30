package com.sold.easy.model.car;

import java.util.List;

import com.sold.easy.model.car.extras.Extras;
import com.sold.easy.model.car.history.History;
import com.sold.easy.model.car.make.Make;
import com.sold.easy.model.car.owner.Owner;

import jakarta.persistence.*;

@Entity
public class Car 
{
	@Id
	@SequenceGenerator(name =" car_id" , sequenceName = "car_id_gen")
	@GeneratedValue(generator = "car_id_gen")
	private long id;
	//Checked
	private Owner owner;
	//Checked
	private Make make;
	//Checked
	private List<Extras> extras;
	//Checked
	private History history;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Make getMake() 
	{
		return make;
	}

	public void setMake(Make make)
	{
		this.make = make;
	}

	public List<Extras> getExtras() 
	{
		return extras;
	}

	public void setExtras(List<Extras> extras) 
	{
		this.extras = extras;
	}

	public History getHistory() 
	{
		return history;
	}

	public void setHistory(History history) 
	{
		this.history = history;
	}
	
	
	
	
	
	
	
}
