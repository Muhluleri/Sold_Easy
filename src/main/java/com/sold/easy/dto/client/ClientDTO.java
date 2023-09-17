package com.sold.easy.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO 
{
	private String name;
	private String surname;
	private String telephoneno;
	private String email;
	private String residentialAddress;
	
	public String getResidentialAddress() 
	{
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephoneno() {
		return telephoneno;
	}

	public void setTelephoneno(String telephoneno) {
		this.telephoneno = telephoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
