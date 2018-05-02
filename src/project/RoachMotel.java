package project;

import java.util.ArrayList;
import project.amenities.*;
import project.room.*;

public class RoachMotel {
	private static RoachMotel uniqueInstance;
	private int capacity;
	ArrayList <RoachColony> customers;
	ArrayList <Observer> waitingList;
	
	private RoachMotel()
	{
		capacity = 20;
		customers = new ArrayList<RoachColony>();
		waitingList = new ArrayList<RoachColony>();
	}
	
	public static RoachMotel getInstance()
	{
		synchronized(RoachMotel.class) {
            if (uniqueInstance == null)
                   uniqueInstance = new RoachMotel();
         }
		
         return uniqueInstance;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public ArrayList <RoachColony> getCustomers()
	{
		return customers;
	}
	
	public ArrayList <Observer> getWaitingList()
	{
		return waitingList;
	}
	
	public void checkIn(RoachColony r)
	{
		if(capacity == 0)
		{
			addToWaitingList(r);
		}
		else
		{
			customers.add(r);
			r.checkIn();
			capacity --;
		}
		
	}
	
	public double checkOut(RoachColony r)
	{
		double totalCharge = 0;
		
		if(customers.contains(r))
		{
			totalCharge = r.checkOut();
			customers.remove(r);
			capacity ++;
			//notify waiting list
		}
		return totalCharge;
	}
	
	public void addToWaitingList(RoachColony r)
	{
		waitingList.add(r);
	}
	
	@Override
	public String toString()
	{
		return "This is a Roach Motel with a capacity of " + capacity;
	}
	

}
