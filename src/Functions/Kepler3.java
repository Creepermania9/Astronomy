package Functions;
import cs1.Keyboard;
import java.lang.Math;
public class Kepler3
{
	private double mass, distance, period;
	final private double G;
	public Kepler3(){
  	G = 6.67 * Math.pow(10,-11);
	}
	public void Period ()
	{
		System.out.print("Enter the mass of the central object: ");
		mass = Keyboard.readDouble();
		System.out.print("Enter the length of the semi-major axis(in AU)");
		distance = Keyboard.readDouble();
		period = Math.sqrt(4*Math.PI*Math.PI/G/mass*Math.pow(distance,3));
		System.out.println("The period(in solar years) is: "+period);
	}
	public void Distance ()
	{
	  	System.out.print("Enter the mass of the central object: ");
	  	mass = Keyboard.readDouble();
		System.out.print("Enter the period in solar years: ");
	  	period = Keyboard.readDouble();
	  	distance = Math.pow(Math.pow(period,2)*G*mass/4/Math.PI/Math.PI,1/3);
	  	System.out.print("The distance(in AU) is "+distance);
	}
}
