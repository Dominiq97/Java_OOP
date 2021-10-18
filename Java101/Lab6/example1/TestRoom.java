import java.util.*;
public class TestRoom
{
	public static void main(String[] args)
	{
		Room r = new Room(127.5,"Living Room");
		Bulb b1 = new Bulb(50);
		Bulb b2 = new Bulb(50);
		b2.turnOn();
		r.addBulb(b1);
		r.addBulb(b2);
		System.out.println(r.getInstantConsumption());
		System.out.println(r.getMaximumConsumption());
		r.turnOnAllBulbs();
		System.out.println(r.getInstantConsumption());
		r.turnOffAllBulbs();
		System.out.println(r.getInstantConsumption());
	}
}