package com.sold.easy.service.sales;

import java.util.List;

import com.sold.easy.dto.client.Request.ClientSaleRequest;
import com.sold.easy.dto.client.Response.ClientSaleResponse;
import com.sold.easy.model.car.Sale;

public interface SalesService
{
    ClientSaleResponse postCarSale(ClientSaleRequest clientSaleRequest);
    public List<Sale> viewRegisteredSales();
    public List<Sale> viewNotRegisteredSales();
}
