package com.sold.easy.service.sales;

import com.sold.easy.dto.client.ClientSaleRequest;
import com.sold.easy.dto.client.ClientSaleResponse;
import com.sold.easy.model.car.Car;
import com.sold.easy.model.car.Client;
import com.sold.easy.model.car.Profile;
import com.sold.easy.model.car.Sale;
import com.sold.easy.service.sales.exception.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.sold.easy.repositories.*;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService {

    private final ClientRepository clientRepository;
    private final ProfileRepository profileRepository;
    private final SalesRepository salesRepository;

    public ClientSaleResponse postCarSale(ClientSaleRequest clientSaleRequest){
        Optional<Client> client = clientRepository.findById(clientSaleRequest.getClientId());
        Optional<Profile> profile = profileRepository.findById(clientSaleRequest.getProfileId());
        if(!client.isPresent()&& !profile.isPresent()){
            throw new ValidationException();
        }

        Car car = null; //lientSaleRequest.getCar();

        Sale sale = new Sale();
        sale.setClient(client.get());
        sale.setProfile(profile.get());
        sale.setCar(car);
        sale = salesRepository.save(sale);

        ClientSaleResponse clientSaleResponse = new ClientSaleResponse();
        clientSaleResponse.setReferenceId(sale.getId().toString());
        return clientSaleResponse;
    }

}
