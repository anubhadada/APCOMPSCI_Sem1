import java.util.*;
public class Toyota extends Car 
{
    private double moveX, moveY;
	
    public Toyota(String pos) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0)), posY =
						Double.parseDouble(position.get(1));
        move(posX, posY);
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