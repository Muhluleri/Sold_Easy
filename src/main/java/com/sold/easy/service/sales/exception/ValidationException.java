package com.sold.easy.service.sales.exception;

public class ValidationException extends RuntimeException 
{

	private static final long serialVersionUID = 2935295210353653906L;

	public  ValidationException()
	{
		super();
	}
	
	public ValidationException(String msg)
	{
		super(msg);
	}
	
	public ValidationException(String msg , Throwable throwable)
	{
		super(msg,throwable);
	}
	
	public ValidationException(Throwable throwable)
	{
		super(throwable);
	}
}

