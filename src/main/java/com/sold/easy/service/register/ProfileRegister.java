package com.sold.easy.service.register;


import com.sold.easy.dto.profile.Request.ProfileRegisterRequest;
import com.sold.easy.dto.profile.Response.ProfileRegisterResponse;
import com.sold.easy.model.car.Profile;

public interface ProfileRegister 
{
	public ProfileRegisterResponse registerProfile(ProfileRegisterRequest profileRegisterRequest);
}
