package project;

import project.amenities.*;
import project.room.*;

public class RoachColony implements Observer{
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
	
	public Room getRoom()
	{
		return room;
	}
	
	public void checkIn(String roomType)
	{
		if(roomType.equalsIgnoreCase("regular room"))
		{
			room = new RegularRoom();
		}
		else if(roomType.equalsIgnoreCase("deluxe room"))
		{
			room = new DeluxeRoom();
		}
		else if(roomType.equalsIgnoreCase("suite room"))
		{
			room = new SuiteRoom();
		}
		room.checkIn();
	}
	
	public double checkOut()
	{
		long currentTime = System.currentTimeMillis();
		double totalCharge = room.getRate() * (currentTime - room.getCheckInTime());
		
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

	@Override
	public void update(Object newState) 
	{
		if((boolean) newState)
		{
			display();
		}
	}
	
	public void display()
	{
		System.out.println("Observer on Waiting List has recieved notification of a vacancy");
	}
	
	public String toString()
	{
		return "Roach Colony name: " + name + " population: " + population + " growth rate: " + growthRate;
	}


}
