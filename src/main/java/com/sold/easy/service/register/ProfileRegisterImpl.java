package com.sold.easy.service.register;

import java.util.Optional;

import com.sold.easy.dto.client.ProfileRegisterRequest;
import com.sold.easy.dto.client.ProfileRegisterResponse;
import com.sold.easy.model.car.Profile;
import com.sold.easy.repositories.ProfileRepository;
import com.sold.easy.service.register.exceptions.UserExistsException;

public class ProfileRegisterImpl implements ProfileRegister
{
	private ProfileRepository profileRepository;

	@Override
	public ProfileRegisterResponse registerProfile(ProfileRegisterRequest profileRegisterRequest) 
	{
		Optional<Profile> profiles = profileRepository.findById(profileRegisterRequest.getProfile().getId());
		//Identify whether the profile already exists
		//If it exists inform user
		if (profiles.isPresent())
		{
			throw new UserExistsException("User already exits");
		}
				
		//Validate the data being inputed 
		//Validation processes
		//Add profile to the database
		Profile profile = profileRegisterRequest.getProfile();
		profile = profileRepository.save(profile);
		//Return message for successful update
		ProfileRegisterResponse profileRegisterResponse = new ProfileRegisterResponse();
		Integer refId = (int) profile.getId();
		profileRegisterResponse.setReferenceId(refId.toString());
		profileRegisterResponse.setMessage("Contragulations , you account has been successfully created.");

		return profileRegisterResponse ;
	}

}
