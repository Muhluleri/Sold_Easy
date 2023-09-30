package com.sold.easy.model.car.extras.internal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InternalExtraType
{
	@Id
	@SequenceGenerator( name = "internalExtraType_id" , sequenceName = "internalExtraType_id")
	@GeneratedValue( generator = "internalExtraType_id_gen")
	private long id;
	private String name;
}
