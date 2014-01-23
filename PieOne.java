// Java Pie Assignment
// This file calls the pie class in a separate file and creates pie objects
// import relevant packages (in this case io because we are dealing with input/output)
import java.io.*;


// declare new class as PieOne
public class PieOne 
{	// declare main method, assign throws IOException to handle input/output
	public static void main(String[] args) throws IOException
	{
		//create a pie object called newPie by calling on Pie class 
		Pie newPie = new Pie();
		
		// declare in as a BufferedReader; used to gain input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// get input from user by calling external pie class and creating Pie objects based on the Pie variables
		System.out.println("What type of pie will you be eating today?");
		newPie.type = in.readLine();
		System.out.println("Ah. " + newPie.type + ". Excellent choice.\n");
		
		System.out.println("What is the diameter of your pie?");
		newPie.diameter = Integer.parseInt(in.readLine());
		System.out.println("Your pie has a diameter of " + newPie.diameter + "\n");
		
		newPie.radius = newPie.diameter / 2;
		System.out.println("Your pie has a radius of " + newPie.radius);
		
	
	}



}