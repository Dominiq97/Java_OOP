// + public
// - private
// # protected
import java.util.*;

public class Circle 
{
	private double radius;
	
	public Circle()  // Constructor method
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius() //getter - is always int
	{
		return radius;
	}
	
	public void setRadius(double radius) //setter - is always void
	{
		this.radius = radius;
	}
	
	public double aire()
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	public String toString()
	{
		return "Circle: " + radius;
	}
}