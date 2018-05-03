package project;

import project.amenities.*;
import project.room.*;

public class RoachColony {
	private String name;
	private int population;
	private double growthRate;
	private Room room; //Class must be made by Factory design pattern, and include CheckIn time?
	
	public RoachColony()
	{
		name = "no name";
		population = 0;
		growthRate = 0;
	}
	
	public RoachColony(String n, int p, double r)
	{
		name = n;
		population = p;
		growthRate = r;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPopulation()
	{
		return population;
	}
	
	public double getGrowthRate()
	{
		return growthRate;
	}
	
	public void checkIn()
	{
		//room = 
	}
	
	public double checkOut()
	{
		long currentTime = System.currentTimeMillis();
		double totalCharge = room.getRate() * (room.getCheckInTime() - currentTime);
		
		return totalCharge;
	}
	
	public void throwParty()
	{
		population = (int) (population * growthRate);
		
		if(room instanceof Shower)
		{
			population = (int) (population * .25);
		}
		else
		{
			population = (int) (population * .50);
		}
	}
	
	public String toString()
	{
		return "Roach Colony name: " + name + " population: " + population + " growth rate: " + growthRate;
	}


}
