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
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCellPhoneNo() {
		return cellPhoneNo;
	}
	public void setCellPhoneNo(String cellPhoneNo) {
		this.cellPhoneNo = cellPhoneNo;
	}

}
