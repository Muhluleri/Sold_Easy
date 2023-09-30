package com.sold.easy.model.car;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Sale {
    @Id
    @SequenceGenerator(name = "sale_id",sequenceName = "sale_id_gen")
    @GeneratedValue(generator = "sale_id_gen")
    private Long id;
	@OneToOne
    private Client client;
	@OneToOne
    private Profile profile;
	@OneToOne
    private Car car;
    private Boolean registered;

}
