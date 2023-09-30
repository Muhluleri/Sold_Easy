package com.sold.easy.controller;

import com.sold.easy.dto.client.Request.ClientSaleRequest;
import com.sold.easy.dto.client.Response.ClientSaleResponse;
import com.sold.easy.dto.profile.Request.ProfileRegisterRequest;
import com.sold.easy.dto.profile.Response.ProfileRegisterResponse;
import com.sold.easy.model.car.Sale;
import com.sold.easy.service.register.ProfileRegister;
import com.sold.easy.service.sales.SalesService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private SalesService salesService;
    private ProfileRegister profileRegister;

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
    
    //Administrator receives a list of all new sale requests 
    //before they are advertised
    @GetMapping("/sales/list/nonRegistered")
    public List<Sale> nonRegisteredSaleRequestList()
    {
    	return salesService.viewNotRegisteredSales();
    }
    
    
    //Show all registered cars for sale
    @GetMapping("/sales/list")
    public List<Sale> SaleRequestList()
    {
		return salesService.viewRegisteredSales();
    	
    }
    
    

}
