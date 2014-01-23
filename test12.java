/**
Java Calculator: allows the input of 2 numbers and multiplies them,
divides the first by the second number,
adds them,
subtracts the second from the first number
*/

// import io packed as we are handling input/output
import java.io.*;

//declare class
public class test12
{	//declare our main method, must use "throws IOException" as we are handling input/output
	public static void main(String[] args) throws IOException
	{
		//declare our BufferedReader to gather input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// an initiator to the program ,if yes program runs, if anything else it does not 
		System.out.println("Continue?");
		String decision = in.readLine();
	
		while (decision == "yes") {
			System.out.println("Please enter number 1");
			double x = Double.parseDouble(in.readLine());
			System.out.println("Please enter number 2");
			double y = Double.parseDouble(in.readLine());
			
			System.out.println(multiply(x,y));
			
			if( y == 0) {
			System.out.println("You cant divide by 0!");
			}
			
			else if (y != 0) {
			divide(x,y);
			}
			
			System.out.println(add(x,y));
			
			System.out.println(subtract(x,y));
			
			System.out.println("Continue?");
			decision = in.readLine();
			
		}
		System.out.println("bye!");
		
	
	}
	
	public static double multiply(double num1, double num2)
		{
		double result= num1*num2;
		return result;
		}
	
	public static double divide(double num1, double num2)
		{
		double result = num1/num2;
		System.out.println(result);
		return result;
		}
	
	public static double add(double num1, double num2)
		{
		double result = num1 + num2;
		return result;
		}
	
	public static double subtract(double num1, double num2)
		{
		double result = num1 - num2;
		return result;
		}

}