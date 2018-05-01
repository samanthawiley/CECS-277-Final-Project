package project;

import java.util.ArrayList;

public class RoachMotel {
	private static RoachMotel uniqueInstance;
	private int capacity;
	ArrayList <Customer> customers;
	ArrayList <RoachColony> waitingList;
	
	private RoachMotel()
	{
		capacity = 20;
	}
	
	public static RoachMotel getInstance()
	{
		synchronized(RoachMotel.class) {
            if (uniqueInstance == null)
                   uniqueInstance = new RoachMotel();
         }
		
         return uniqueInstance;
	}
	
	
	

}
