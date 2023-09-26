package com.sold.easy.controller;

import com.sold.easy.dto.client.ClientSaleRequest;
import com.sold.easy.dto.client.ClientSaleResponse;
import com.sold.easy.dto.profile.ProfileRegisterRequest;
import com.sold.easy.dto.profile.ProfileRegisterResponse;
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
    
    //Administrator receives a list of all new sale requests before they are advertised
    @GetMapping("/sales/list/nonRegistered")
    public List<Sale> nonRegisteredSaleRequestList()
    {
    	return salesService.viewNotRegisteredSales();
    }
    
    @GetMapping("/sales/list")
    public List<Sale> SaleRequestList()
    {
		return salesService.viewRegisteredSales();
    	
    }
    
    

}
