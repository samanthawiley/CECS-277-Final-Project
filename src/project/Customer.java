package project;

public class Customer {
	private RoachColony roachColony;
	private Room room;
	long checkInTime;
	
	public Customer(RoachColony r)
	{
		checkInTime = System.currentTimeMillis();
		roachColony = r;
	}
	
	public RoachColony getRoachColony()
	{
		return roachColony;
	}
	
	public long getCheckInTime()
	{
		return checkInTime;
	}
	
	public Room getRoom()
	{
		return room;
	}
	
	public void party()
	{
		roachColony.setPopulation((int) roachColony.getGrowthRate() * roachColony.getPopulation());
		
		if(room instanceof SprayResistantShower)
		{
			roachColony.setPopulation((int) (roachColony.getPopulation() * 0.25));
		}
		else
		{
			roachColony.setPopulation((int) (roachColony.getPopulation() * 0.50));
		}
	}
	
	public String toString()
	{
		return roachColony.toString() + " check in time: " + checkInTime + room.toString();
	}

}

