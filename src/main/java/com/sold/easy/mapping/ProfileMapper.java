package com.sold.easy.mapping;

import org.springframework.stereotype.Component;

import com.sold.easy.dto.client.ClientDTO;
import com.sold.easy.dto.profile.ProfileDTO;
import com.sold.easy.model.car.Client;
import com.sold.easy.model.car.Profile;

@Component
public class ProfileMapper 
{
	public Profile mapProfileToDomain(ProfileDTO profileDTO)
	{
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
}
