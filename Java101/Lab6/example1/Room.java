import java.util.*;
public class Room
{
	private String name;
	private double surface;
	private Bulb[] bulbs;
	private int noBulbs;

	public Room(double surface,String name)
	{
		this.name = name;
		this.surface = surface;
	    bulbs = new Bulb[10];
		noBulbs = 0;
	}
	
	public void addBulb(Bulb b)
	{	
		if(noBulbs < bulbs.length)
		{
			bulbs[noBulbs] = b;
			noBulbs++;
		}
	}
	
	public void turnOffAllBulbs()
	{
		for(int i=0;i<noBulbs;i++)
			bulbs[i].turnOff();
	}
	
	public void turnOnAllBulbs()
	{
		for(int i=0;i<noBulbs;i++)
			bulbs[i].turnOn();
	}
	
	public int getInstantConsumption()
	{
		int consumption=0;
		for(int i=0;i<noBulbs;i++)
			if(bulbs[i].isTurnedOn())
				consumption=consumption+bulbs[i].getPower();
		return consumption;	
	}
	
	public int getMaximumConsumption()
	{
		int consumption=0;
		for(int i=0;i<noBulbs;i++)
			consumption=consumption+bulbs[i].getPower();
		return consumption;
	}
	
}