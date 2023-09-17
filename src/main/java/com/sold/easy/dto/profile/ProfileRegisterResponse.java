package com.sold.easy.dto.profile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileRegisterResponse 
{
	private String referenceId;
	private String message;
	private long clientId;
	private long profileId;
	
	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getReferenceId() 
	{
		return referenceId;
	}
	
	public void setReferenceId(String referenceId) 
	{
		this.referenceId = referenceId ;
	}
	
	public String getMessage() 
	{
		return message;
	}
	
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	
	
	
}
