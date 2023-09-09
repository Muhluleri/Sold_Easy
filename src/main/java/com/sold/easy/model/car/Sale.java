package com.sold.easy.model.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
    private Client client;
    private Profile profile;
    private Car car;
}
