public class Honda extends Car 
{
    private double moveX, moveY;
	
    public Honda(double[] pos) 
	{
        super();
        move(pos[0], pos[1]);
    }
    public void move(double x, double y) 
	{
        this.moveX += x;
        this.moveY += y;
    }
    public double[] getLoc() 
	{
        double[] location = {moveX, moveY};
        return location;
    }
}