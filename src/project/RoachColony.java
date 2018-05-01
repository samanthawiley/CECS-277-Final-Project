package project;

public class RoachColony {
	private String name;
	private int population;
	private double growthRate;
	
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
	
	public void setPopulation(int p)
	{
		population = p;
	}
	
	public String toString()
	{
		return "Roach Colony Name: " + name + " population: " + population + " growth rate: " + growthRate;
	}


}
