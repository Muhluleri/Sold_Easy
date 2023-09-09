package com.sold.easy.model.car.extras.external;

public class ExternalExtras 
{
	private boolean sunRoof;
	private boolean towbar;
	private boolean tonneauCover;
	private boolean bullbar;
	private boolean safetyFilm;
	private boolean canopy;
	private boolean binLiner;
	
	public ExternalExtras(boolean sunRoof, boolean towbar, boolean tonneauCover, 
			              boolean bullbar, boolean safetyFilm, boolean canopy, 
			              boolean binLiner) 
	{
		this.sunRoof = sunRoof;
		this.towbar = towbar;
		this.tonneauCover = tonneauCover;
		this.bullbar = bullbar;
		this.safetyFilm = safetyFilm;
		this.canopy = canopy;
		this.binLiner = binLiner;
	}

	public boolean isSunRoof() 
	{
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) 
	{
		this.sunRoof = sunRoof;
	}

	public boolean isTowbar()
	{
		return towbar;
	}

	public void setTowbar(boolean towbar) 
	{
		this.towbar = towbar;
	}

	public boolean isTonneauCover() 
	{
		return tonneauCover;
	}

	public void setTonneauCover(boolean tonneauCover) 
	{
		this.tonneauCover = tonneauCover;
	}

	public boolean isBullbar() 
	{
		return bullbar;
	}

	public void setBullbar(boolean bullbar) 
	{
		this.bullbar = bullbar;
	}

	public boolean isSafetyFilm() 
	{
		return safetyFilm;
	}

	public void setSafetyFilm(boolean safetyFilm)
	{
		this.safetyFilm = safetyFilm;
	}

	public boolean isCanopy() 
	{
		return canopy;
	}

	public void setCanopy(boolean canopy) 
	{
		this.canopy = canopy;
	}

	public boolean isBinLiner() 
	{
		return binLiner;
	}

	public void setBinLiner(boolean binLiner) 
	{
		this.binLiner = binLiner;
	}
		
	
	
	
}
