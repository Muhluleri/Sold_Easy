package com.sold.easy.model.car.history;

import java.util.List;

import com.sold.easy.model.car.history.conditionhistory.ConditionHistory;
import com.sold.easy.model.car.history.financehistory.FinanceHistory;
import com.sold.easy.model.car.history.licensehistory.LicenseHistory;
import com.sold.easy.model.car.history.ownershiphistory.OwnershipHistory;
import com.sold.easy.model.car.history.servicehistory.ServiceHistory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class History 
{
	//Checked
	@Id
	@SequenceGenerator(name = "History_id" , sequenceName = "History_id_gen")
	@GeneratedValue( generator = "History_id_gen")
	private long id;
	@OneToMany
	private List<OwnershipHistory> ownershipHistory;
	//Checked
	@OneToOne
	private ConditionHistory conditionHistory;
	//Checked
	@OneToOne
	private FinanceHistory financeHistory;
	//Checked
	@OneToOne
	private ServiceHistory serviceHistory;
	//Checked
	@OneToOne
	private LicenseHistory licenseHistory;

}
