package com.sold.easy.controller;

import com.sold.easy.dto.client.ClientSaleRequest;
import com.sold.easy.dto.client.ClientSaleResponse;
import com.sold.easy.dto.profile.ProfileRegisterRequest;
import com.sold.easy.dto.profile.ProfileRegisterResponse;
import com.sold.easy.service.register.ProfileRegister;
import com.sold.easy.service.sales.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final SalesService salesService;
    private final ProfileRegister profileRegister;

    //Register profile 
    
    @PostMapping("/register")
    public ProfileRegisterResponse registerProfile(@RequestBody ProfileRegisterRequest profileRegisterRequest)
    {
    	return profileRegister.registerProfile(profileRegisterRequest);
    }
    
    //Register car sale request
    @PostMapping("/sales")
    public ClientSaleResponse registerCarSale(@RequestBody ClientSaleRequest clientSaleRequest)
    {
        return salesService.postCarSale(clientSaleRequest);
    }

}
