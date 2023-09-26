package com.sold.easy.mapping;

import org.springframework.stereotype.Component;

import com.sold.easy.dto.car.CarDTO;
import com.sold.easy.dto.client.ClientDTO;
import com.sold.easy.dto.profile.ProfileDTO;
import com.sold.easy.dto.sale.SaleDTO;
import com.sold.easy.model.car.Car;
import com.sold.easy.model.car.Client;
import com.sold.easy.model.car.Profile;
import com.sold.easy.model.car.Sale;
import com.sold.easy.service.register.FormatChecker;

@Component
public class ProfileMapper 
{
	public Profile mapProfileToDomain(ProfileDTO profileDTO)
	{
		FormatChecker formatchecker = new FormatChecker(profileDTO);
		Profile profile = new Profile();
		profile.setClient(mapClientToDomain(profileDTO.getClient()));
		return profile;
	}
	
	public Client mapClientToDomain(ClientDTO clientDTO)
	{
		Client client = new Client();
		client.setFirstName(clientDTO.getName());
		client.setLastName(clientDTO.getSurname());
		client.setEmailAddress(clientDTO.getEmail());
		client.setResidentialAddress(clientDTO.getResidentialAddress());
		client.setCellPhoneNo(clientDTO.getTelephoneno());
		return client;
	}
	
	public Sale mapSaleToDomain(SaleDTO saleDTO)
	{
		Sale sale = new Sale();
		sale.setProfile(mapProfileToDomain(saleDTO.getProfile()));
		sale.setClient(sale.getProfile().getClient());
		sale.setCar(mapCarToDomain(saleDTO.getCar()));
		return sale;
	}
	
	public Car mapCarToDomain(CarDTO carDTO)
	{
		Car car = new Car();

		return car;
	}
}
