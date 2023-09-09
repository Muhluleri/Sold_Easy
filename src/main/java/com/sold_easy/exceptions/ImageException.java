package com.sold_easy.exceptions;

public class ImageException extends RuntimeException 
{
	private static final long serialVersionUID = 2394635172940050262L;

	public ImageException()
	{
		super();
	}
	
	public ImageException(String msg)
	{
		super(msg);
	}
	
	public ImageException(String msg, Throwable throwable )
	{
		super(msg,throwable);
	}
	
	public ImageException(Throwable throwable)
	{
		super(throwable);
	}
}
