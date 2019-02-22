
public class CarBlueprint 
{
	//fields
	private int yearModel;
	private String make;
	private int speed;
	
	//constructors - need same name as class
	
	public CarBlueprint(int y, String m)
	{
		yearModel = y;
		make =  m;
		speed = 0;
	}
	
	public int getYear()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public void accelerate()
	{
		speed += 5;
	}
	public void deaccelerate()
	{
		speed -= 5;
	}
	
}
