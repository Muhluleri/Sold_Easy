package com.sold.easy.service.register;

import java.util.Optional;

import com.sold.easy.dto.profile.ProfileRegisterRequest;
import com.sold.easy.dto.profile.ProfileRegisterResponse;
import com.sold.easy.mapping.ProfileMapper;
import com.sold.easy.model.car.Profile;
import com.sold.easy.repositories.ProfileRepository;
import com.sold.easy.service.register.exceptions.UserExistsException;

public class ProfileRegisterImpl implements ProfileRegister
{
	private ProfileRepository profileRepository;
	private ProfileMapper profileMapper;

	@Override
	public ProfileRegisterResponse registerProfile(ProfileRegisterRequest profileRegisterRequest) 
	{
		Optional<Profile> profileName = profileRepository.findByName(profileRegisterRequest.getProfile().getClient().getName());
		Optional<Profile> profileEmail = profileRepository.findbyEmail(profileRegisterRequest.getProfile().getClient().getEmail());
		//Identify whether the profile already exists
		//If it exists inform user
		if (profileName.isPresent() && profileEmail.isPresent())
		{
			throw new UserExistsException("User already exits");
		}
				
		//Validate the data being inputed 
		
		//Validation processes
		
		//Add profile to the database
		Profile profile = profileMapper.mapProfileToDomain(profileRegisterRequest.getProfile());
		profile = profileRepository.save(profile);
		//Return message for successful update
		ProfileRegisterResponse profileRegisterResponse = new ProfileRegisterResponse();
		profileRegisterResponse.setProfileId(profile.getId());
		profileRegisterResponse.setClientId(0);
		Integer refId = (int) profile.getId();
		profileRegisterResponse.setReferenceId(refId.toString());
		profileRegisterResponse.setMessage("Contragulations , you account has been successfully created.");

		return profileRegisterResponse ;
	}

}
