package com.sold_easy.exceptions;

public class ValidationException extends RuntimeException
{
	private static final long serialVersionUID = 2048483965201441449L;
	
	public ValidationException()
	{
		super();
	}
	
	public ValidationException(String msg)
	{
		super(msg);
	}
	
	public ValidationException(String msg, Throwable throwable)
	{
		super(msg,throwable);
	}
	
	public ValidationException(Throwable throwable)
	{
		super(throwable);
	}

}
