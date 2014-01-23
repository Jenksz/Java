import java.io.*;
import java.text.*;

public class output
{

public static void main(String[] args) throws IOException
	{
		double number = 438.978;
		DecimalFormat x = new DecimalFormat("##");
		System.out.println(x.format(number));
                
		x = new DecimalFormat("##.#");
		System.out.println(x.format(number));

		x = new DecimalFormat("##.##");
		System.out.println(x.format(number));

		x = new DecimalFormat("##.###");
		System.out.println(x.format(number));
		
	}
}
