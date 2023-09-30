package com.sold.easy.dto.car.History.OwnershipHistory;

import java.util.Date;
import java.util.List;

import com.sold.easy.dto.car.History.OwnershipHistory.Documentation.DocumentationDTO;


public class OwnershipHistoryDTO 
{
	private double purchasePrice;
	private double tradeInValue;
	private String puchaseLocation;
	private Integer ownershipDuration;
	private boolean warranty;
	private List<DocumentationDTO> documentations;
	private Integer mileage;
	private Date buyDate;
	private Date sellDate;
	
	public double getPurchasePrice() 
	{
		return purchasePrice;
	}
	
	public void setPurchasePrice(double purchasePrice)
	{
		this.purchasePrice = purchasePrice;
	}
	
	public double getTradeInValue() 
	{
		return tradeInValue;
	}
	
	public void setTradeInValue(double tradeInValue) 
	{
		this.tradeInValue = tradeInValue;
	}
	
	public String getPuchaseLocation() 
	{
		return puchaseLocation;
	}
	
	public void setPuchaseLocation(String puchaseLocation)
	{
		this.puchaseLocation = puchaseLocation;
	}
	
	public Integer getOwnershipDuration() 
	{
		return ownershipDuration;
	}
	
	public void setOwnershipDuration(Integer ownershipDuration)
	{
		this.ownershipDuration = ownershipDuration;
	}
	
	public boolean isWarranty()
	{
		return warranty;
	}
	
	public void setWarranty(boolean warranty) 
	{
		this.warranty = warranty;
	}
	
	public List<DocumentationDTO> getDocumentations() 
	{
		return documentations;
	}
	
	public void setDocumentations(List<DocumentationDTO> documentations) 
	{
		this.documentations = documentations;
	}
	
	public Integer getMileage()
	{
		return mileage;
	}
	
	public void setMileage(Integer mileage) 
	{
		this.mileage = mileage;
	}
	
	public Date getBuyDate() 
	{
		return buyDate;
	}
	
	public void setBuyDate(Date buyDate)
	{
		this.buyDate = buyDate;
	}
	
	public Date getSellDate() 
	{
		return sellDate;
	}
	
	public void setSellDate(Date sellDate) 
	{
		this.sellDate = sellDate;
	}
	
}
