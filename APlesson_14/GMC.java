public class GMC implements Location
{
	private double xcoordinate, ycoordinate;
	
	public GMC()
	{
		xcoordinate = ycoordinate = 0;
	}
	
	public GMC(double x, double y)
	{
		xcoordinate = x;
		ycoordinate = y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000) + 1;
	}
	
	public void move(int x, int y)
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