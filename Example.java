// import required packages for the program, importing all classes from packages to be on the safe side
import java.io.*;
import java.util.*;
import java.text.*;

// Declare a class, name doesn't really matter so Example chosen
public class Example
{
// need to use throws IOException because we are dealing with input and output, simple main method will not suffice
	public static void main(String[] args) throws IOException
	{
		// declare department names as strings
		String department1;
		String department2;
		String department3;
		String department4;
		
		// declare number of employees in each department as ints, note that employees 3 is a double as it has decimal places
		int employees1;
		int employees2;
		double employees3;
		int employees4;
		
		// declare cost per employee in each department as doubles because they have decimal places
		double cpe1;
		double cpe2;
		double cpe3;
		double cpe4;
		
		//declare sales in each department as doubles because they have decimal places
		double sales1;
		double sales2;
		double sales3;
		double sales4;
		
		
		
		// declare in as a BufferedReader; used to gain input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		
		//get input from the user to define department names
		System.out.println("What is the name of department 1?");
		department1 = in.readLine();
		System.out.println("What is the name of department 2?");
		department2 = in.readLine();
		System.out.println("What is the name of department 3?");
		department3 = in.readLine();
		System.out.println("What is the name of department 4?");
		department4 = in.readLine();
		System.out.println("\n");
		

		
		//get input from the user to define number of employees
		System.out.println("How many employees are in department 1?");
		employees1 = Integer.parseInt(in.readLine());
		System.out.println("How many employees are in department 2?");
		employees2 = Integer.parseInt(in.readLine());
		System.out.println("How many employees are in department 3?");
		employees3 = Double.parseDouble(in.readLine());
		System.out.println("How many employees are in department 4?");
		employees4 = Integer.parseInt(in.readLine());
		System.out.println(employees4 + "" + employees3);
		System.out.println("\n");
		
		
		// get input from user to define cost per employee in each department
		System.out.println("What is the cost per employee in department 1?");
		cpe1 = Double.parseDouble(in.readLine());
		System.out.println("What is the cost per employee in department 2?");
		cpe2 = Double.parseDouble(in.readLine());
		System.out.println("What is the cost per employee in department 3?");
		cpe3 = Double.parseDouble(in.readLine());
		System.out.println("What is the cost per employee in department 4?");
		cpe4 = Double.parseDouble(in.readLine());
		System.out.println("\n");
		
		
		// get input from user to define sales in each department
		System.out.println("What are the sales in department 1?");
		sales1 = Double.parseDouble(in.readLine());
		System.out.println("What are the sales in department 2?");
		sales2 = Double.parseDouble(in.readLine());
		System.out.println("What are the sales in department 3?");
		sales3 = Double.parseDouble(in.readLine());
		System.out.println("What are the sales in department 4?");
		sales4 = Double.parseDouble(in.readLine());
		System.out.println("\n");
		
		// declare and state whether different departments are making a profit
		double profits1 = sales1 - (employees1 * cpe1);
		DecimalFormat x = new DecimalFormat("$#,###.##");
		System.out.println("The following represents the profit (if positive) or cost (if negative) of " + department1 + ": "  + x.format(profits1));
		
		double profits2 = sales2 - (employees2 * cpe2);
		DecimalFormat y = new DecimalFormat("$#,###.##");
		System.out.println("The following represents the profit (if positive) or cost (if negative) of " + department2 + ": "  + y.format(profits2));
		
		double profits3 = sales3 - (employees3 * cpe3);
		DecimalFormat z = new DecimalFormat("$#,###.##");
		System.out.println("The following represents the profit (if positive) or cost (if negative) of " + department3 + ": "  + z.format(profits3));
		
		double profits4 = sales4 - (employees4 * cpe4);
		DecimalFormat a = new DecimalFormat("$#,###.##");
		System.out.println("The following represents the profit (if positive) or cost (if negative) of " + department4 + ": "  + a.format(profits4));
		
		// declare and state whether the departments overall are making a profit
		double totalProfit = profits1 + profits2 + profits3 + profits4;
		DecimalFormat b = new DecimalFormat("$#,###.##");
		System.out.println("The cost (if negative) or profits (if positive) of running all the departments is: " + b.format(totalProfit));
	}
}