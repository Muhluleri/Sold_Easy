package com.sold.easy.model.car.history.servicehistory;

import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ServiceHistory 
{
	@Id
	@SequenceGenerator(name = "serviceHistory_id", sequenceName = "serviceHistory_id_gen")
	@GeneratedValue ( generator = "serviceHistory_id_gen")
	private long id;
	private String servicePlan;
	@OneToMany
	private List<Service> services;

}
