package com.sold.easy.mapping;

import org.springframework.stereotype.Component;
import com.sold.easy.model.car.owner.Owner;
import com.sold.easy.repositories.Owner.OwnerRepository;

@Component
public class OwnerMapper 
{
	private OwnerRepository ownerRepository;
	
	public Owner mapOwnerToDomain(long ownerId)
	{
		Owner owner = ownerRepository.findById(ownerId).get();
		return owner;	
	}
}
