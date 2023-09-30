package com.sold.easy.model.car.history.ownershiphistory;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Documentation 
{
	@Id
	@SequenceGenerator( name = "documentation_id" , sequenceName = "documentation_id_gen")
	@GeneratedValue( generator = "documentation_id_gen")
	private long id ; 
	private String name;
	@Enumerated(EnumType.STRING)
	private DocumentationType documentType;

}
 
