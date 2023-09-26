package com.sold.easy.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO 
{
	private long id;
	private String name;
	private String surname;
	private String idNumber;
	private String telephoneno;
	private String email;
	private String residentialAddress;
	
	public String getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber) 
	{
		this.idNumber = idNumber;
	}
	
	public String getResidentialAddress() 
	{
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) 
	{
		this.residentialAddress = residentialAddress;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname) 
	{
		this.surname = surname;
	}

	public String getTelephoneno() 
	{
		return telephoneno;
	}

	public void setTelephoneno(String telephoneno) 
	{
		this.telephoneno = telephoneno;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}
}
