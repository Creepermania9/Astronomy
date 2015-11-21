package Functions;

import cs1.Keyboard;
import java.lang.Math;

public class Ellipse
{
    private double major=0, minor=0, eccentricity=0, foci_length=0; //major and minor are the radius not full length
    private int case1=0;
    public Ellipse()
    {
    }
    public void calculate()
    {
        System.out.println("What would you like to calculate?");
        System.out.println("1) Semi-major axis \n 2) Semi-minor axis \n 3) Eccentricity \n 4) Length between foci");
        case1 = Keyboard.readInt();
        System.out.println("Enter 0 for those not given.");
        switch(case1) 
        {
            case 1: //Semi-major axis
                System.out.println("Enter the length of the semi-minor axis: ");
                minor = Keyboard.readDouble();
                System.out.println("Enter the ecentricity: ");
                eccentricity = Keyboard.readDouble();
                System.out.println("Enter the length between the foci");
                foci_length = Keyboard.readDouble();
                if(minor == 0)
                {
                    major = (foci_length / 2) / eccentricity;
                }
                else if(eccentricity == 0)
                {
                    major = Math.sqrt(Math.pow(foci_length/2,2)+Math.pow(minor,2));
                }
                else if(foci_length == 0)
                {
                    major = Math.sqrt(Math.pow(minor,2)/(1-Math.pow(eccentricity, 2)));
                }
                else
                	System.out.println("Please make one of the values 0.");
                System.out.println("The semi-major axis is " + major);
            break;
            case 2: //Semi-minor axis
                System.out.println("Enter the length of the semi-major axis: ");
                major = Keyboard.readDouble();
                System.out.println("Enter the ecentricity: ");
                eccentricity = Keyboard.readDouble();
                System.out.println("Enter the length between the foci");
                foci_length = Keyboard.readDouble();
                if(major == 0)
                {
                    major = foci_length / 2 / eccentricity;
                    minor = Math.sqrt(Math.pow(major,2)-Math.pow(foci_length/2,2));
                }
                else if(eccentricity == 0)
                {
                    minor = Math.sqrt(Math.pow(major,2)-Math.pow(foci_length/2,2));
                }
                else if(foci_length == 0)
                {
                    minor = Math.sqrt((1-Math.pow(eccentricity,2))*Math.pow(major,2));
                }
                else
                	System.out.println("Please make one of the values 0.");
                System.out.println("The semi-major axis is " + minor);
            break;
            case 3: //Eccentricity
                System.out.println("Enter the length of the semi-major axis: ");
                major = Keyboard.readDouble();
                System.out.println("Enter the length of the semi-minor axis: ");
                minor = Keyboard.readDouble();
                System.out.println("Enter the length between the foci");
                foci_length = Keyboard.readDouble();
                if(major == 0)
                {
                    major = Math.sqrt(Math.pow(minor,2)+Math.pow(foci_length/2,2));
                    eccentricity = (foci_length/2)/major;
                }
                else if(minor == 0)
                {
                    eccentricity = (foci_length/2)/major;
                }
                else if(foci_length == 0)
                {
                    foci_length = Math.sqrt(Math.pow(major,2)-Math.pow(minor,2))*2;
                    eccentricity = (foci_length/2)/major;
                }
                else
                	System.out.println("Please make one of the values 0.");
                System.out.println("The semi-major axis is " + eccentricity);
            break;
            case 4: //Length between foci
            	System.out.print("Enter the length of the semi-major axis: ");
            	major = Keyboard.readInt();
            	System.out.print("Enter the length of the semi-minor axis: ");
            	minor = Keyboard.readInt();
            	System.out.print("Please enter the eccentricity: ");
            	eccentricity = Keyboard.readInt();
            	if(major == 0)
            	{
            		major = Math.sqrt(Math.pow(minor,2)/(1-Math.pow(eccentricity, 2)));
            		foci_length = Math.sqrt(Math.pow(major,2)-Math.pow(minor,2))*2;
            	}
            	else if(minor==0)
            	{
            		minor = Math.sqrt(Math.pow(major, 2)*(1-Math.pow(eccentricity, 2)));
            		foci_length = Math.sqrt(Math.pow(major,2)-Math.pow(minor,2))*2;
            	}
            	else if(eccentricity==0)
            		foci_length = Math.sqrt(Math.pow(major,2)-Math.pow(minor,2))*2;
            	else
            		System.out.println("That is not a valid choice.");
            	System.out.println(foci_length);
            break;
            default: //Error Case
                System.out.println("That is not a valid choice.");
            break;
        }
    }
}
