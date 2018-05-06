package project;

import java.util.ArrayList; 
import project.amenities.*;
import project.room.*;

public class RoachMotel implements Subject{
	private static RoachMotel uniqueInstance;
	private int capacity;
	private boolean vacancySign = true;
	private ArrayList <RoachColony> customers;
	private ArrayList <Observer> waitingList;
	
	
	private RoachMotel()
	{
		capacity = 20;
		customers = new ArrayList<RoachColony>();
		waitingList = new ArrayList<Observer>();
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
	
	public String getVacancySign()
	{
		if(true)
		{
			return "Vacancy";
		}
		return "No Vacancy";
	}
	
	public ArrayList <RoachColony> getCustomers()
	{
		return customers;
	}
	
	public ArrayList <Observer> getWaitingList()
	{
		return waitingList;
	}
	
	public String checkIn(RoachColony r, String roomType)
	{
		if(capacity == 0)
		{
			vacancySign = false; 
			addToWaitingList((Observer) r);
			return "Currently there are no vacancies. " + r.toString() + " has been added to waiting list.";
		}
		else
		{
			customers.add(r);
			r.checkIn(roomType);
			capacity --;
			return r.toString() + " has been checked in.";
		}
		
	}
	
	public double checkOut(RoachColony r)
	{
		double totalCharge = 0;
		
		if(customers.contains(r))
		{
			totalCharge = r.checkOut();
			customers.remove(r);
			if(capacity == 0)
			{
				vacancySign = true;
				notifyObservers();
			}
			capacity ++;
		}
		return totalCharge;
	}

	@Override
	public void addToWaitingList(Observer o) {
		waitingList.add(o);
	}

	@Override
	public void removeFromWaitingList(Observer o) {
		if(waitingList.contains(o))
		{
			waitingList.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i < waitingList.size(); i++)
		{
			waitingList.get(i).update(vacancySign);
		}
		waitingList.clear();
	}
	
	@Override
	public String toString()
	{
		return "This is a Roach Motel with a current capacity of " + capacity + " " + getVacancySign();
	}
	

}
