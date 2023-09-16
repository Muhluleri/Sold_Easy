package com.sold.easy.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client 
{
	private long id; 
	private String name;
	private String surname;
	private String telephoneno;
	private String email;
	
	public Client(long id, String name, String surname, 
			      String telephoneno, String email) 
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telephoneno = telephoneno;
		this.email = email;
	}
	
	
}
