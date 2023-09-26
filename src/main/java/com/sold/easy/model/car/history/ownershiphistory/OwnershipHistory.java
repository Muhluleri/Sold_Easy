package com.sold.easy.model.car.history.ownershiphistory;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class OwnershipHistory 
{
	@Id
	@SequenceGenerator( name = "ownershiphistory_id", sequenceName = "ownershiphistory_id_gen")
	@GeneratedValue( generator = "ownershiphistory_id_gen")
	private long id;
	private double purchasePrice;
	private double tradeInValue;
	private String puchaseLocation;
	private Integer ownershipDuration;
	private boolean warranty;
	private List<Documentation> documentations;
	private Integer mileage;
	private Date buyDate;
	private Date sellDate;
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
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

	public String getPuchaseLocation() {
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
	
	public Integer getMileage() 
	{
		return mileage;
	}
	
	public void setMileage(Integer mileage) 
	{
		this.mileage = mileage;
	}

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

	public List<Documentation> getDocumentations() 
	{
		return documentations;
	}

	public void setDocumentations(List<Documentation> documentations)
	{
		this.documentations = documentations;
	}
	
}
