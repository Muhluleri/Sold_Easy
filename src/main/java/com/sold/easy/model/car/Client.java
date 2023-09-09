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
public class Client {

    @Id
    @SequenceGenerator(name = "client_id",sequenceName = "client_id_gen",allocationSize = 50)
    @GeneratedValue(generator = "client_id_gen")
    private long id;
    private String idNumber;
    private String firstName;
    private String LastName;
    private String emailAddress;
    private String residentialAddress;
    private String cellPhoneNo;

}
