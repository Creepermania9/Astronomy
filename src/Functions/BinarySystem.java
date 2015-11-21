package Functions;
import cs1.Keyboard;
import java.lang.Math;
public class BinarySystem
{
	private double mass, distance, period, massOther, gravity, G, AU;
    public BinarySystem()
    {
    G = 6.67 * Math.pow(10,-11);
    AU = 1.495979 * Math.pow(10, 11);
    }
    public void Mass ()
	{
		System.out.print("Enter the other star's mass: ");
		mass = Keyboard.readDouble();
		System.out.print("Enter the period(in years): ");
		period = Keyboard.readDouble();
		System.out.print("Enter the distance(in AU) of the semi-major axis: ");
		distance = Keyboard.readDouble();
		massOther = Math.pow(distance,3)/Math.pow(period,2)-mass;
		System.out.println("The other mass is "+massOther);
	}
	public void period ()
	{
		System.out.print("Enter one star's mass: ");
		mass = Keyboard.readDouble();
		System.out.print("Enter the other star's mass: ");
		massOther = Keyboard.readDouble();
		System.out.print("Enter the distance(in AU) of the semi-major axis: ");
		distance = Keyboard.readDouble();
		period = Math.pow(distance,3)/(mass+massOther);
		System.out.println("The other mass is "+massOther);
	}
	public void distance()
	{
		System.out.print("Enter one star's mass: ");
		mass = Keyboard.readDouble();
		System.out.print("Enter the other star's mass: ");
		massOther = Keyboard.readDouble();
		System.out.print("Enter the period(in years): ");
		period = Keyboard.readDouble();
		distance = Math.pow((mass + massOther) * Math.pow(period, 2),1/3);
		System.out.println("The distance of the semi-major axis is: " + distance );
	}
	public void gravity()
	{
		System.out.print("Enter one star's mass: ");
		mass = Keyboard.readDouble();
		System.out.print("Enter the other star's mass: ");
		massOther = Keyboard.readDouble();
		System.out.print("Enter the distance(in AU) between the stars: ");
		distance = Keyboard.readDouble();
		distance = distance * AU;
		gravity = (G * mass * massOther)/Math.pow(distance,2);
		System.out.println("The gravity between the stars is " + gravity);
	}
}
