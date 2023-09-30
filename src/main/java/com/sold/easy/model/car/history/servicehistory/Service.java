package com.sold.easy.model.car.history.servicehistory;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Service 
{
	@Id
	@SequenceGenerator( name = "service_id" , sequenceName = "service_id_gen")
	@GeneratedValue( generator = "service_id_gen")
	private long id;
	private Date serviceDate;
	private Integer serviceMilleage;
	private String serviceDealer;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public Date getServiceDate() 
	{
		return serviceDate;
	}
	
	public void setServiceDate(Date serviceDate)
	{
		this.serviceDate = serviceDate;
	}
	public Integer getServiceMilleage() 
	{
		return serviceMilleage;
	}
	public void setServiceMilleage(Integer serviceMilleage) 
	{
		this.serviceMilleage = serviceMilleage;
	}
	public String getServiceDealer() 
	{
		return serviceDealer;
	}
	public void setServiceDealer(String serviceDealer) 
	{
		this.serviceDealer = serviceDealer;
	}
	
	
}
