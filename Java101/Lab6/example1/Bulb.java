import java.util.*;
public class Bulb
{
	private int power;
	private boolean turnedOn;
	
	public Bulb(int power)
	{
		this.power = power;
	}
	
	public void turnOn()
	{
		turnedOn = true;
	}
	
	public void turnOff()
	{
		turnedOn = false;
	}
	
	public int getPower()
	{
		return power;
	}
	
	public boolean isTurnedOn()
	{
		return turnedOn;
	}
}