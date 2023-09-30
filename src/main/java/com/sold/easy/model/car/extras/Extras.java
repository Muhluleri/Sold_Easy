package com.sold.easy.model.car.extras;

import java.util.List;

import com.sold.easy.model.car.extras.external.ExternalExtra;
import com.sold.easy.model.car.extras.internal.InternalExtra;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Extras
{
	@Id
	@SequenceGenerator(name = "extra_id" , sequenceName = "extra_id_gen")
	@GeneratedValue( generator = "extra_id_gen")
	private long id;
	@OneToMany
	private List<ExternalExtra> externalExtras;
	@OneToMany
	private List<InternalExtra> internalExtras;
	
	
}
