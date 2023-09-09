package com.sold_easy.car;

import com.sold_easy.car.extras.Extras;
import com.sold_easy.car.history.History;
import com.sold_easy.car.make.Make;
import com.sold_easy.car.owner.Owner;

public class Car 
{
	private Owner owner;
	private Make make;
	private Extras extras;
	private History history;
	
	public Car(Owner owner, Make make, Extras extras, History history) 
	{
		this.owner = owner;
		this.make = make;
		this.extras = extras;
		this.history = history;
	}

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

	public Extras getExtras() 
	{
		return extras;
	}

	public void setExtras(Extras extras) 
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
