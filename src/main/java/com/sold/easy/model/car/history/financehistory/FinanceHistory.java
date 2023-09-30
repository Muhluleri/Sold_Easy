package com.sold.easy.model.car.history.financehistory;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FinanceHistory 
{
	@Id
	@SequenceGenerator( name = "financeHistory_id" , sequenceName = "financeHistory_id_gen")
	@GeneratedValue( generator = "financeHistory_id_gen")
	private long id;
	private boolean financed;
	private double outstandingAmount;
	private double financedAmount;
	
}
