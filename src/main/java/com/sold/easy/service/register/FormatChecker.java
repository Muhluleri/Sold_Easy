package com.sold.easy.service.register;

import com.sold.easy.model.car.Profile;

public class FormatChecker 
{
	private Profile profile;

	public FormatChecker(Profile profile) 
	{
		this.profile = profile;
		
		checkName(profile.getClient().getFirstName());
		checkName(profile.getClient().getLastName());
		checkIdNo(profile.getClient().getIdNumber());
		checkEmail(profile.getClient().getEmailAddress());
		checkPhoneNo(profile.getClient().getCellPhoneNo());
	}

	private void checkPhoneNo(String cellPhoneNo) 
	{
		String tmp = cellPhoneNo.trim();
		for (int i = 0 ; i < tmp.length(); i++)
		{
			boolean flag = Character.isSpaceChar(cellPhoneNo.charAt(i));
			if (flag)
			{
				throw new
			}
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
