package com.sold.easy.dto.client.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientSaleResponse 
{

	private String referenceId;
    private String message;
    
    public String getReferenceId() 
    {
		return referenceId;
	}
    
	public void setReferenceId(String referenceId)
	{
		this.referenceId = referenceId;
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
