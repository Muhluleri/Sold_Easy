package com.sold.easy.model.car.extras;

import com.sold.easy.model.car.extras.external.ExternalExtras;
import com.sold.easy.model.car.extras.internal.InternalExtras;

public class Extras
{
	private ExternalExtras externalExtras;
	private InternalExtras internalExtras;
	
	public Extras(ExternalExtras externalExtras, InternalExtras internalExtras) 
	{
		this.externalExtras = externalExtras;
		this.internalExtras = internalExtras;
	}

	public ExternalExtras getExternalExtras() 
	{
		return externalExtras;
	}

	public void setExternalExtras(ExternalExtras externalExtras) 
	{
		this.externalExtras = externalExtras;
	}

	public InternalExtras getInternalExtras() 
	{
		return internalExtras;
	}

	public void setInternalExtras(InternalExtras internalExtras) 
	{
		this.internalExtras = internalExtras;
	}

	
	
}
