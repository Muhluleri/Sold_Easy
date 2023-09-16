package com.sold.easy.service.register;


import com.sold.easy.dto.client.ProfileRegisterRequest;
import com.sold.easy.dto.client.ProfileRegisterResponse;
import com.sold.easy.model.car.Profile;

public interface ProfileRegister 
{
	public ProfileRegisterResponse registerProfile(ProfileRegisterRequest profileRegisterRequest);
}
