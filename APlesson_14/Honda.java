public class Honda implements Location
{
	private double xcoordinate, ycoordinate;
	
	public Honda()
	{
		xcoordinate = ycoordinate = 0;
	}
	
	public Honda(double[] location)
	{
		xcoordinate = location[0];
		ycoordinate = location[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000) + 1;
	}
	
	public void move(double x, double y)
	{
		xcoordinate = x;
		ycoordinate = y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xcoordinate, ycoordinate};
		return location;
	}
}