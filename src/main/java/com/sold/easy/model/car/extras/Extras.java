package com.sold.easy.model.car.extras;

import java.util.List;

import com.sold.easy.model.car.extras.external.ExternalExtra;
import com.sold.easy.model.car.extras.internal.InternalExtra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Extras
{
	@Id
	@SequenceGenerator(name = "extra_id" , sequenceName = "extra_id_gen")
	@GeneratedValue( generator = "extra_id_gen")
	private long id;
	private List<ExternalExtra> externalExtras;
	private List<InternalExtra> internalExtras;
	
	public List<ExternalExtra> getExternalExtras() 
	{
		return externalExtras;
	}

	public void setExternalExtras(List<ExternalExtra> externalExtras) 
	{
		this.externalExtras = externalExtras;
	}

	public List<InternalExtra> getInternalExtras() 
	{
		return internalExtras;
	}

	public void setInternalExtras(List<InternalExtra> internalExtras) 
	{
		this.internalExtras = internalExtras;
	}

	
	
}
