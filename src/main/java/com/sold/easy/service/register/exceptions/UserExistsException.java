package com.sold.easy.service.register.exceptions;

public class UserExistsException extends RuntimeException
{
	private static final long serialVersionUID = -4347997044683949080L;
	
	public UserExistsException()
	{
		super();
	}
	
	public UserExistsException(String msg)
	{
		super(msg);
	}
	
	public UserExistsException(String msg, Throwable throwable)
	{
		super(msg,throwable);
	}
	
	public UserExistsException(Throwable throwable)
	{
		super(throwable);
	}
}
