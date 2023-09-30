package com.sold.easy.mapping;

import java.util.ArrayList;
import java.util.List;

import com.sold.easy.dto.car.History.ConditionHistory.Damage.DamageDTO;
import com.sold.easy.model.car.history.conditionhistory.Damage;

public class DamageMapper 
{
	public List<Damage> mapDamageToDomain(List<DamageDTO> damageDTO) 
	{
		List<Damage> damages = new ArrayList<Damage>();
		Damage damage = new Damage();
		for (DamageDTO eachdamage : damageDTO)
		{
			damage.setDamage(eachdamage.getDamage());
			damage.setDescription(eachdamage.getDescription());
			damage.setImageURL(eachdamage.getImageURL());
			damages.add(damage);
		}
		return damages;
	}
}
