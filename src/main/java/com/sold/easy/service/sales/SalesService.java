package com.sold.easy.service.sales;

import java.util.List;

import com.sold.easy.dto.client.ClientSaleRequest;
import com.sold.easy.dto.client.ClientSaleResponse;
import com.sold.easy.model.car.Sale;

public interface SalesService
{
    ClientSaleResponse postCarSale(ClientSaleRequest clientSaleRequest);
    public List<Sale> viewRegisteredSales();
    public List<Sale> viewNotRegisteredSales();
}
