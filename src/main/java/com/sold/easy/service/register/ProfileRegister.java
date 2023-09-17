package com.sold.easy.service.register;


import com.sold.easy.dto.profile.ProfileRegisterRequest;
import com.sold.easy.dto.profile.ProfileRegisterResponse;
import com.sold.easy.model.car.Profile;

public interface ProfileRegister 
{
	public ProfileRegisterResponse registerProfile(ProfileRegisterRequest profileRegisterRequest);
}
