package com.sold.easy.mapping;

import java.util.*;
import org.springframework.stereotype.Component;
import com.sold.easy.model.car.extras.Extras;
import com.sold.easy.repositories.Car.Extras.ExtraRepository;

@Component
public class ExtraMapper 
{
	private ExtraRepository extraRepository;
	public List<Extras> mapExtraToDomain(List<Long> extraId)
	{
		List<Extras> extra = new ArrayList<Extras>();
		for(long extraSpecId : extraId)
		{
			Extras specExtra = extraRepository.findById(extraSpecId).get();
			extra.add(specExtra);
		}
		return extra;
	}
}
