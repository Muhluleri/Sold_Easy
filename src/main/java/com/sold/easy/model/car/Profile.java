package com.sold.easy.model.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
//import lombok.Getter;
//import lombok.Setter;

import java.util.List;


@Entity
public class Profile {
    @Id
    @SequenceGenerator(name = "profile_id",sequenceName = "profile_id_gen")
    @GeneratedValue(generator = "profile_id_gen")
    private long id;
    private Client client;   
    private List<Sale> sales;
	
    public Profile(long id, Client client, List<Sale> sales) 
    {
		this.id = id;
		this.client = client;
		this.sales = sales;
	}

	public Profile() 
	{
		
	}
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public Client getClient() 
	{
		return client;
	}

	public void setClient(Client client) 
	{
		this.client = client;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) 
	{
		this.sales = sales;
	}
         
}
