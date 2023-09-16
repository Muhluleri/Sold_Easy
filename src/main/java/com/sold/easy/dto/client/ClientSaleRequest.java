package com.sold.easy.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientSaleRequest {

    private long clientId;
    private long profileId;
    private Car car;
    
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

}
