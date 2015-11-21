import cs1.Keyboard;
import Functions.*;
public class Astro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The current avaliable functions are: \n 1) Binary Systems \n 2) Ellipses \n 3) Kepler's Third Law");
		int choice = Keyboard.readInt();
		switch(choice)
		{
		case(1): //Binary Systems
			System.out.println("Binary Systems: ");
			System.out.println("The avaliable functions are: \n 1) Mass \n 2) Period \n 3) Distance 4) Gravity");
			choice = Keyboard.readInt();
			BinarySystem system1 = new BinarySystem();
			switch(choice)
			{
			case(1)://Mass
				system1.Mass();
				break;
			case(2)://Period
				system1.period();
				break;
			case(3)://Distance
				system1.distance();
				break;
			case(4)://Gravity
				system1.gravity();
				break;
			default:
				System.out.println("That is not a valid choice.");
			}
			break;
		case(2)://Ellipse
			System.out.println("Ellipse: ");
			Ellipse shape = new Ellipse();
			shape.calculate();
			break;
		case(3)://Kepler's Third Law
			System.out.println("Kepler's Third Law: ");
			System.out.println("The avaliable functions: \n 1) Period \n 2) Distance");
			choice= Keyboard.readInt();
			Kepler3 kepler = new Kepler3();
			if(choice ==1)
				kepler.Period();
			else 
				kepler.Distance();
			break;
		}
	}

}
