/**
Java Calculator: allows the input of 2 numbers and multiplies them,
divides the first by the second number,
adds them,
subtracts the second from the first number
*/

// import io packed as we are handling input/output
import java.io.*;

//declare class
public class MiniCalculator
{ 	//declare our main method, must use "throws IOException" as we are handling input/output
	public static void main(String[] args) throws IOException
	{
		//declare our BufferedReader to gather input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// to start the program we must declare the initiator as being y
		String decision = "y";

		// an initiator to the program ,if y program runs, if anything else it does not
		while (decision.equals("y"))
		{
			// get the two numbers from the user
			System.out.println("Please enter number 1");
			double x = Double.parseDouble(in.readLine());
			System.out.println("Please enter number 2");
			double y = Double.parseDouble(in.readLine());
			
			// call on multiplication function to multiply number 1 by number 2
			System.out.println("When you multiply " + x + " and " + y + " you get: " + multiply(x,y) + "\n");
			
			// in event that user tries to divide by user, inform them this is impossible
			if( y == 0)
			{
				System.out.println("You cant divide by 0!");
			}
			
			// if user not dividing by 0 then divide number 1 by number 2
			else if (y != 0)
			{
				System.out.println("When you divide " + x + " by " + y + " you get: " + divide(x,y) + "\n");
			}
			
			// add number 1 and number 2
			System.out.println("When you add " + x + " and " + y + " you get: " + add(x,y) + "\n");
			
			// subtract number 2 from number 1
			System.out.println("When you subtract " + x + " by " + y + " you get: " + subtract(x,y) + "\n");
			
			// ask if user wishes to continue, decision is redeclared by user, if "y" program continues, if else it does not
			System.out.println("Continue? \n");
			decision = in.readLine();

		}
		// once program has exited print this
		System.out.println("Bye!");
		}
		
		// declare multiplication function, multiplies num1 by num2
		public static double multiply(double num1, double num2)
		{
		double result= num1*num2;
		return result;
		}
		
		// declare divison function, divides num1 by num2
		public static double divide(double num1, double num2)
		{
		double result = num1/num2;
		return result;
		}
		
		// declare addition function, adds num1 and num2
		public static double add(double num1, double num2)
		{
		double result = num1 + num2;
		return result;
		}
		
		// declare subtraction function, subtracts num1 by num 2
		public static double subtract(double num1, double num2)
		{
		double result = num1 - num2;
		return result;
		}
}