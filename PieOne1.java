// Java Pie Assignment
// This file calls the pie class in a separate file and creates pie objects
// import relevant packages (in this case io because we are dealing with input/output)
import java.io.*;


// declare new class as PieOne
public class PieOne 
{	// declare main method, assign throws IOException to handle input/output
	public static void main(String[] args) throws IOException
	{	
		
		//declare variable for this class 
		
		String pieType;
		float pieDiameter;
		float pieRadius;
		int piePieces;
		
		// declare in as a BufferedReader; used to gain input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// get input from user by calling external pie class and creating Pie objects based on the Pie variables
		System.out.println("What type of pie will you be eating today?");
		pieType = in.readLine();
					
		
		System.out.println("What is the diameter of your pie?");
		pieDiameter = Integer.parseInt(in.readLine());
		
		//declare and initiate first pie

		Pie newPie = new Pie(pieType, pieDiameter);

		System.out.println("Ah. " + newPie.type + ". Excellent choice.\n");
		System.out.println("Your pie has a diameter of " + newPie.diameter + "\n");
		System.out.println("Your pie has a radius of " + newPie.radius);

		//check to see how many peices there are in this pie
		piePieces = newPie.returnPieces();	

		System.out.println("The number of peices in the pie is: " + piePieces + "\n");
		

		//Ask about the second pie	

		System.out.println("What type of pie will you be eating today for your second pie?");
		pieType = in.readLine();
					
		System.out.println("What is the diameter of your second pie?");
		pieDiameter = Integer.parseInt(in.readLine());
		
		//declare and initiate second pie
		Pie newPie2 = new Pie(pieType, pieDiameter);
		
		System.out.println("Ah. " + newPie2.type + ". Excellent choice.\n");
		System.out.println("Your pie has a diameter of " + newPie2.diameter + "\n");
		System.out.println("Your pie has a radius of " + newPie2.radius);

		System.out.println("The number of peices in the pie is: " + newPie2.returnPieces() + "\n");

		//print the pies andthe number of pieces in them..notices that there is a difference between this print statement and that of the print statement in the first pie.
		System.out.println("The number of peices of the first pie is: " + newPie.returnPieces() +"\n"+ 		"The number of peices of the second pie is: " + newPie2.returnPieces()+ "\n");

		//ask for change in pie 2

		System.out.println("What woud you like to change the diameter of" + newPie2.type);
		newPie2.setDiameter(Integer.parseInt(in.readLine()));
		System.out.println("The number of peices of the first pie is: " + newPie.returnPieces() +"\n"+ 		"The number of peices of the second pie is: " + newPie2.returnPieces()+ "\n");


		
				

	}



}

