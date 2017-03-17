import java.util.*;
public class Car implements Location
{
	private final int ID;
	private double[] location = new double[2];
	
	public Car() 
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double xCoord, double yCoord) 
	{
		location[0] += xCoord;
		location[1] += yCoord;
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public double[] getLoc() 
	{
        return location;
    }
}