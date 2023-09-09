package com.sold_easy.car.extras.internal;

public class InternalExtras 
{
	private boolean airCondition;
	private boolean leatherSeats;
	private boolean tracker;
	private boolean spareKey;
	private boolean rollbar;
	
	public InternalExtras(boolean airCondition, boolean leatherSeats, 
			              boolean tracker, boolean spareKey,
			              boolean rollbar) 
	{
		this.airCondition = airCondition;
		this.leatherSeats = leatherSeats;
		this.tracker = tracker;
		this.spareKey = spareKey;
		this.rollbar = rollbar;
	}

	public boolean isAirCondition() 
	{
		return airCondition;
	}

	public void setAirCondition(boolean airCondition) 
	{
		this.airCondition = airCondition;
	}

	public boolean isLeatherSeats() 
	{
		return leatherSeats;
	}

	public void setLeatherSeats(boolean leatherSeats) 
	{
		this.leatherSeats = leatherSeats;
	}

	public boolean isTracker() 
	{
		return tracker;
	}

	public void setTracker(boolean tracker) 
	{
		this.tracker = tracker;
	}

	public boolean isSpareKey() 
	{
		return spareKey;
	}

	public void setSpareKey(boolean spareKey) 
	{
		this.spareKey = spareKey;
	}

	public boolean isRollbar() 
	{
		return rollbar;
	}

	public void setRollbar(boolean rollbar) 
	{
		this.rollbar = rollbar;
	}
	
		
}
