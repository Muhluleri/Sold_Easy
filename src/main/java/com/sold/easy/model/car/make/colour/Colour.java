package com.sold.easy.model.car.make.colour;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Colour 
{
	@Id
	@SequenceGenerator( name = "colour_id" , sequenceName = "colour_id_gen")
	@GeneratedValue( generator = "colour_id_gen")
	private long id;

	@OneToOne
	private ExternalColour externalColour;
	private String internalColour;

}
