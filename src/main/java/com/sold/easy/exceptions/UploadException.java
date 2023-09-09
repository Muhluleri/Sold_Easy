package com.sold.easy.exceptions;

public class UploadException extends RuntimeException
{

	private static final long serialVersionUID = -2099248661062091490L;
	
	public UploadException()
	{
		super();
	}
	
	public UploadException(String msg)
	{
		super(msg);
	}
	
	public UploadException(String msg, Throwable throwable)
	{
		super(msg,throwable);
	}
	
	public UploadException(Throwable throwable)
	{
		super(throwable);
		
	}
}
