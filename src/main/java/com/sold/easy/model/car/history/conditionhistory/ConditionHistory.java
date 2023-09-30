package com.sold.easy.model.car.history.conditionhistory;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ConditionHistory
{
	@Id
	@SequenceGenerator(name = "conditionHistory_id" , sequenceName = "conditionHistory_id_gen")
	@GeneratedValue( generator = "conditionHistory_id_gen")
	private long id;
	@Enumerated(EnumType.STRING)
	private ConditionType condition;
	@OneToMany
	private List<Damage> damages;

}
