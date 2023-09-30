package com.sold.easy.model.car.extras.external;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExternalExtra 
{

	@Id
	@SequenceGenerator(name = "external_extra_id" , sequenceName = "external_extra_gen")
	@GeneratedValue( generator = "external_extra_gen")
	private long id;

	@OneToOne
	private ExternalExtraType externalExtraType;

}
