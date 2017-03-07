public class Toyota implements Location
{
	private double xcoordinate, ycoordinate;
	double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String T)
	{
		xcoordinate = Double.parseDouble(T.substring(0,1));
		ycoordinate = Double.parseDouble(T.substring(3));
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