package com.sold.easy.model.car.history.ownershiphistory;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OwnershipHistory 
{
	@Id
	@SequenceGenerator( name = "ownershiphistory_id", sequenceName = "ownershiphistory_id_gen")
	@GeneratedValue( generator = "ownershiphistory_id_gen")
	private long id;
	private double purchasePrice;
	private double tradeInValue;
	private String puchaseLocation;
	private Integer ownershipDuration;
	private boolean warranty;
	@OneToMany
	private List<Documentation> documentations;
	private Integer mileage;
	private Date buyDate;
	private Date sellDate;

}
