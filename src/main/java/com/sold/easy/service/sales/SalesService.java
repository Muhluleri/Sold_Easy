package com.sold.easy.service.sales;

import com.sold.easy.dto.client.ClientSaleRequest;
import com.sold.easy.dto.client.ClientSaleResponse;

public interface SalesService
{
    ClientSaleResponse postCarSale(ClientSaleRequest clientSaleRequest);
}
