// program rolls two dice and only exits if a 7 or 11 rolled
// program uses string methods to alter and display strings

// import required packages for the program
// import all classes to be on the safe side
// will be using input/ouput, math, and string formatting so those imports are needed
import java.io.*;
import java.math.*;
import java.text.*;

// Declare a class, class name Dice chosen
public class Dice
{
// need to use throws IOException because we are dealing with input and output, simple main method will not suffice
	public static void main(String[] args) throws IOException
	{
	
		// declare variables for the two dice, randomize each
		// die can each be rolled for # between 1-6
		float dice1 = Math.round(Math.random() * 5) + 1;
		float dice2 = Math.round(Math.random() * 5) + 1;
		
		// declare variables relevant to strings to be input by user
		String string1;
		String string2;
		int order;
		int totalChars;
		String uppercase;
		String lowercase;
		
		// declare variable for combined roll
		float totalRoll = dice1 + dice2;
		
		//create loop to determine if totalRoll is a 7 or 11, if not continue rolling
		while ((totalRoll != 7.0) && (totalRoll != 11.0))
		{	// re-roll dice if 7 or 11 not rolled
			dice1 = Math.round(Math.random() * 5) + 1 ;
			dice2 = Math.round(Math.random() * 5) + 1 ;
			//re-declare new total roll
			totalRoll = dice1 + dice2;
			
			//display to user what values were rolled			
			System.out.println("The roll on die 1 is: " + dice1);
			System.out.println("The roll on die 2 is: " + dice2);
			System.out.println("The total of the two rolls is: " + totalRoll + "\n");
			
			//when roll == a 7 or 11 while loop exits
			if ((totalRoll == 7.0) || (totalRoll == 11.0)) 
			{
			System.out.println("You win!\n");
			}
		}
			
		// declare in as a BufferedReader; used to gain input from the user
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		// ask user to input strings
		System.out.println("Please input string 1.");
		string1 = in.readLine();
		System.out.println("Please input string 2.");
		string2 = in.readLine();
		
		//compare two strings for alphabetic ordering
		order = string1.compareToIgnoreCase(string2);
		
		// create conditional branch based on the value given to C
		//value of order determined by alphabetical comparison of string1 to string 2
		if (order > 0) 
		{
			System.out.println("\n" + string2 + " alphabetically precedes " + string1);
		}
		else if (order < 0)
		{ 
			System.out.println("\n" + string1 + " alphabetically precedes " + string2);
		}
		else if (order == 0)
		{
			System.out.println("\n" + string2 + " is alphabetically equivalent to " + string1);
		}
		
		// determine and sum the number of characters in string1 and string
		totalChars = string1.length() + string2.length();
		System.out.println("When string 1 and string 2 are combined they have " + totalChars + " characters.");
		
		//use string methods to change strings to upper/lowercase and display result to user
		uppercase = string1.toUpperCase();
		System.out.println(uppercase);
		lowercase = string2.toLowerCase();
		System.out.println(lowercase);
		
	}
}