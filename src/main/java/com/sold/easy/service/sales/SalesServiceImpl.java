
package com.sold.easy.service.sales;

import com.sold.easy.dto.client.Request.ClientSaleRequest;
import com.sold.easy.dto.client.Response.ClientSaleResponse;
import com.sold.easy.mapping.ProfileMapper;
import com.sold.easy.model.car.Client;
import com.sold.easy.model.car.Profile;
import com.sold.easy.model.car.Sale;
import com.sold.easy.service.sales.exception.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.sold.easy.repositories.Client.ClientRepository;
import com.sold.easy.repositories.Profile.ProfileRepository;
import com.sold.easy.repositories.Sale.SalesRepository;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService 
{

    private ClientRepository clientRepository;
    private ProfileRepository profileRepository;
    private SalesRepository salesRepository;
    private ProfileMapper profileMapper;

    public ClientSaleResponse postCarSale(ClientSaleRequest clientSaleRequest)
    {
        Optional<Client> client = clientRepository.findById(clientSaleRequest.getClientId());
        Optional<Profile> profile = profileRepository.findById(clientSaleRequest.getProfileId());
        if(!client.isPresent()&& !profile.isPresent())
        
        {
            throw new ValidationException();
        }

        Sale sale = profileMapper.mapSaleToDomain(clientSaleRequest.getSale());
        sale = salesRepository.save(sale);

        ClientSaleResponse clientSaleResponse = new ClientSaleResponse();
        clientSaleResponse.setReferenceId(sale.getId().toString());
        return clientSaleResponse;
    }
    
    public List<Sale> viewRegisteredSales()
    {
    	boolean flag = true;
		return salesRepository.findByRegistered(flag );
    }
    
    public List<Sale> viewNotRegisteredSales()
    {
    	boolean flag = false;
    	return salesRepository.findByRegistered(flag);
    }
    
   
}
