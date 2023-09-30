package com.sold.easy.dto.car;

import java.util.List;

import com.sold.easy.dto.car.History.HistoryDTO;

public class CarDTO 
{
	//Build CarDTO
	private long ownerid;
	private long makeId ;
	private List<Long> extrasId;
	private HistoryDTO history;
	
	public long getOwnerid() 
	{
		return ownerid;
	}

	public void setOwnerid(long ownerid) 
	{
		this.ownerid = ownerid;
	}

	public long getMakeId() 
	{
		return makeId;
	}

	public void setMakeId(long makeId) 
	{
		this.makeId = makeId;
	}

	public List<Long> getExtrasId() 
	{
		return extrasId;
	}

	public void setExtrasId(List<Long> extrasId) 
	{
		this.extrasId = extrasId;
	}

	public HistoryDTO getHistory() 
	{
		return history;
	}

	public void setHistory(HistoryDTO history) 
	{
		this.history = history;
	}
}
