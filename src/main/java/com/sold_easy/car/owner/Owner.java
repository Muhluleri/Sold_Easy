package com.sold_easy.car.owner;

public class Owner 
{
	private String name;
	private String surname;
	private String email;
	private String cellNo;
	private String altNo;
	
	public Owner(String name, String surname, String email, 
				   String cellNo, String altNo) 
	{
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.cellNo = cellNo;
		this.altNo = altNo;
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

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getCellNo()
	{
		return cellNo;
	}

	public void setCellNo(String cellNo) 
	{
		this.cellNo = cellNo;
	}

	public String getAltNo() 
	{
		return altNo;
	}

	public void setAltNo(String altNo) 
	{
		this.altNo = altNo;
	}
	
	
	
	
} 
