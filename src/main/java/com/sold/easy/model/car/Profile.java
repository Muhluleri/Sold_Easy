package com.sold.easy.model.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Profile {
    @Id
    @SequenceGenerator(name = "profile_id",sequenceName = "profile_id_gen")
    @GeneratedValue(generator = "profile_id_gen")
    private long id;
    private Client client;
    private List<Sale> sales;
}