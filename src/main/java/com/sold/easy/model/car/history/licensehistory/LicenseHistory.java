package com.sold.easy.model.car.history.licensehistory;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LicenseHistory 
{
	@Id
	@SequenceGenerator( name = "licenseHistory_id", sequenceName = "licenseHistory_id_gen")
	@GeneratedValue( generator = "licenseHistory_id_gen")
	private long id;
	private boolean validLicense;
	private Date dateOfExpiry;
	private String vehicleRegister;
}
