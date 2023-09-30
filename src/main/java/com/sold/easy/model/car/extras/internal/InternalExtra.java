package com.sold.easy.model.car.extras.internal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InternalExtra
{
	@Id
	@SequenceGenerator(name = "internal_extra_id" , sequenceName = "internal_extra_gen")
	@GeneratedValue( generator = "internal_extra_gen")
	private long id;
	@OneToOne
	private InternalExtraType internalExtraType;
}
