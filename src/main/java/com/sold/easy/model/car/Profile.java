package com.sold.easy.model.car;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import lombok.Getter;
//import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Profile {
    @Id
    @SequenceGenerator(name = "profile_id",sequenceName = "profile_id_gen")
    @GeneratedValue(generator = "profile_id_gen")
    private long id;

	@OneToOne
	private Client client;

    private String name;
    private String email;

	@OneToMany
    private List<Sale> sales;

}
