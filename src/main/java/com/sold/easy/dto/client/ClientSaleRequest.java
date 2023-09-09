package com.sold.easy.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientSaleRequest {

    private long clientId;
    private long profileId;
    private Car car;

}
