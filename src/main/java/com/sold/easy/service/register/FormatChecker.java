package com.sold.easy.service.register;

import com.sold.easy.dto.profile.ProfileDTO;

public class FormatChecker 
{
	@SuppressWarnings("unused")
	private ProfileDTO profile;

	public FormatChecker(ProfileDTO profile) 
	{
		this.profile = profile;
		
		checkName(profile.getClient().getName());
		checkName(profile.getClient().getSurname());
		checkIdNo(profile.getClient().getIdNumber());
		checkEmail(profile.getClient().getEmail());
		checkPhoneNo(profile.getClient().getTelephoneno());
	}

	private void checkPhoneNo(String cellPhoneNo) 
	{
		String tmp = cellPhoneNo.trim();
		for (int i = 0 ; i < tmp.length(); i++)
		{
			boolean flag = Character.isSpaceChar(cellPhoneNo.charAt(i));
			if (flag)
			{
				throw new InvalidFormatException();
			}
		}
		
		if (cellPhoneNo.charAt(0)== '0')
		{
			throw new InvalidFormatException("Please indentify the country code of the cellphone number e.g. +27");
		}
		
		if (tmp.length() != 12)
		{
			throw new InvalidFormatException("There is an invalid amount of digits in the cellphone number");
		}
		
	}

	private void checkEmail(String emailAddress) 
	{

	}

	private void checkIdNo(String idNumber) 
	{
		
	}

	private void checkName(String Name) 
	{
		for (int i = 0 ; i < Name.length(); i++)
		{
			boolean flag = Character.isLetter(Name.charAt(i));
			if(!flag)
			{
				throw new InvalidFormatException("No use of numbers or special characters");
			}
		}
	}
	
	
	
}
