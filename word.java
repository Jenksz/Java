// program rolls two dice and only exits if a 7 or 11 rolled
// program uses string methods to alter and display strings

// import required packages for the program
// import all classes to be on the safe side
// will be using input/ouput, math, and string formatting so those imports are needed
import java.io.*;
import java.math.*;
import java.text.*;

// Declare a class, class name Dice chosen
public class word
{
// need to use throws IOException because we are dealing with input and output, simple main method will not suffice
	public static void main(String[] args)  {
		equivalence("Hello", "Goodbye");
    
}

public static int equivalence(String word1, String word2){
		int r;
		if (word1.equals(word2)) {
		r=(Math.round(Math.random()*9)+1);
		return r;}
		else {
		System.out.println("The words are not the same!");
    }
	}
	}
	
