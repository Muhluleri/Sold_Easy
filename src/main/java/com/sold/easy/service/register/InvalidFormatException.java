package com.sold.easy.service.register;

public class InvalidFormatException extends RuntimeException
{

	private static final long serialVersionUID = -5271004836154910871L;
	
	public InvalidFormatException()
	{
		super();
	}
	
	public InvalidFormatException(String msg)
	{
		super(msg);
	}
	
	public InvalidFormatException(String msg, Throwable throwable)
	{
		super(msg,throwable);
	}
	
	public InvalidFormatException(Throwable throwable)
	{
		super(throwable);
	}
}
